import java.util.Scanner;

public class P47_RemoveBoxes {
    public static int removeBoxes(int[] boxes) {
        int n = boxes.length;
        int[][][] dp = new int[n][n][n];
        return calculatePoints(boxes, 0, n - 1, 0, dp);
    }

    private static int calculatePoints(int[] boxes, int l, int r, int k, int[][][] dp) {
        if (l > r) return 0;
        if (dp[l][r][k] > 0) return dp[l][r][k];

        while (l < r && boxes[r] == boxes[r - 1]) {
            r--;
            k++;
        }

        int points = calculatePoints(boxes, l, r - 1, 0, dp) + (k + 1) * (k + 1);

        for (int i = l; i < r; i++) {
            if (boxes[i] == boxes[r]) {
                points = Math.max(points, calculatePoints(boxes, l, i, k + 1, dp) + calculatePoints(boxes, i + 1, r - 1, 0, dp));
            }
        }
        dp[l][r][k] = points;
        return points;
    }

    public static void main(String[] args) {
        int[] boxes = {1, 3, 2, 2, 2, 3, 4, 3, 1};
        System.out.println("Maximum Points: " + removeBoxes(boxes));
    }
}
