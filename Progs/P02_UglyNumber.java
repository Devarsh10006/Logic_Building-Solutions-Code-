import java.util.Scanner;

public class P02_UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        for (int factor : new int[]{2, 3, 5}) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Output: " + isUgly(n));
        sc.close();
    }
}
