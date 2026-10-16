import java.util.Scanner;

public class P63_ConcentricSquarePattern {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(i + " ");
                } else {
                    int ring = Math.min(Math.min(i - 2, n - 1 - i), Math.min(j - 2, n - 1 - j));
                    char ch = (char) ('A' + ring);
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (e.g. 7): ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
