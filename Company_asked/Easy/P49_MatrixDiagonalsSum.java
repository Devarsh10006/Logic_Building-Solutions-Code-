import java.util.Scanner;

public class P49_MatrixDiagonalsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dimension of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int principalSum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            principalSum += mat[i][i];
            secondarySum += mat[i][n - 1 - i];
        }

        System.out.println("Principal Diagonal Sum = " + principalSum);
        System.out.println("Secondary Diagonal Sum = " + secondarySum);
        sc.close();
    }
}
