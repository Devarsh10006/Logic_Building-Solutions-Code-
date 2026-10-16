import java.util.Scanner;

public class P06_HappyNumber {
    public static int nextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void checkHappy(int n) {
        int current = n;
        System.out.print(current + " ");
        int count89 = 0;

        while (current != 1) {
            current = nextNumber(current);
            System.out.print(current + " ");
            if (current == 89) {
                count89++;
                if (count89 == 2) {
                    System.out.println("\n" + n + " is not a happy number");
                    return;
                }
            }
        }
        System.out.println("\n" + n + " is a happy number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        checkHappy(n);
        sc.close();
    }
}
