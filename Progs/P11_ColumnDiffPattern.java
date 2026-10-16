import java.util.Scanner;

public class P11_ColumnDiffPattern {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            int val = i;
            System.out.print(val);
            for (int j = 1; j < i; j++) {
                val += (n - j);
                System.out.print(" " + val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (e.g. 4 or 5): ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
