import java.util.Scanner;

public class P16_SwastikaPattern {
    public static void printSwastika(int n) {
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == mid || j == mid) {
                    System.out.print("* ");
                } else if (i < mid && j == 0) {
                    System.out.print("* ");
                } else if (i == 0 && j > mid) {
                    System.out.print("* ");
                } else if (i > mid && j == n - 1) {
                    System.out.print("* ");
                } else if (i == n - 1 && j < mid) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd dimension for Swastika (e.g. 7): ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Please provide an odd integer.");
        } else {
            printSwastika(n);
        }
        sc.close();
    }
}
