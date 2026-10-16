import java.util.Scanner;

public class P20_TrailingZeroes {
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Trailing zeroes in " + n + "! : " + trailingZeroes(n));
        sc.close();
    }
}
