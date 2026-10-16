import java.util.Scanner;

public class P12_OddNumberStarPattern {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("1");
                continue;
            }
            // Ascending odd numbers
            int maxOdd = 2 * i - 1;
            for (int val = 1; val <= maxOdd; val += 2) {
                System.out.print(val + " * ");
            }
            // Descending odd numbers
            for (int val = maxOdd - 2; val >= 1; val -= 2) {
                System.out.print(val);
                if (val > 1) System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
