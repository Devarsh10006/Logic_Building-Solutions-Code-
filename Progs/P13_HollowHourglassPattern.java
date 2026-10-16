import java.util.Scanner;

public class P13_HollowHourglassPattern {
    public static void printPattern(int n) {
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    System.out.print("* ");
                } else if (j == i || j == n - 1 - i) {
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
        System.out.print("Enter odd dimension N (e.g. 7): ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
