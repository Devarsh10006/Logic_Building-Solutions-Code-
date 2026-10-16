import java.util.Scanner;

public class P61_RowWithMaxOnes {
    public static int rowWithMax1s(int[][] mat, int n, int m) {
        int maxRow = -1;
        int j = m - 1;

        for (int i = 0; i < n; i++) {
            while (j >= 0 && mat[i][j] == 1) {
                j--;
                maxRow = i;
            }
        }
        return maxRow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows N and columns M: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];

        System.out.println("Enter binary matrix (row-wise sorted):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row index with maximum 1s: " + rowWithMax1s(mat, n, m));
        sc.close();
    }
}
