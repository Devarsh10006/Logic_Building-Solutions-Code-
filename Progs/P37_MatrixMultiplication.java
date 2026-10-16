import java.util.Scanner;

public class P37_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of matrix 1 (r1 c1): ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) a[i][j] = sc.nextInt();
        }

        System.out.print("Enter rows and columns of matrix 2 (r2 c2): ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        if (c1 != r2) {
            System.out.println("Error: Incompatible dimensions for multiplication (c1 must equal r2).");
            sc.close();
            return;
        }

        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) b[i][j] = sc.nextInt();
        }

        int[][] c = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
