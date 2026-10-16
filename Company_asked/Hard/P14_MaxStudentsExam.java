import java.util.Arrays;
import java.util.Scanner;

public class P14_MaxStudentsExam {
    public static int maxStudents(char[][] seats) {
        int m = seats.length;
        int n = seats[0].length;
        int[] broken = new int[m];

        for (int i = 0; i < m; i++) {
            int mask = 0;
            for (int j = 0; j < n; j++) {
                if (seats[i][j] == '#') {
                    mask |= (1 << j);
                }
            }
            broken[i] = mask;
        }

        int maxMask = 1 << n;
        int[][] dp = new int[m + 1][maxMask];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        dp[0][0] = 0;

        for (int i = 1; i <= m; i++) {
            for (int mask = 0; mask < maxMask; mask++) {
                // mask must not have adjacent students or sit on broken seats
                if ((mask & (mask >> 1)) != 0 || (mask & broken[i - 1]) != 0) {
                    continue;
                }
                int count = Integer.bitCount(mask);

                for (int prevMask = 0; prevMask < maxMask; prevMask++) {
                    if (dp[i - 1][prevMask] == -1) continue;
                    // cannot see upper-left or upper-right
                    if ((mask & (prevMask >> 1)) == 0 && (mask & (prevMask << 1)) == 0) {
                        dp[i][mask] = Math.max(dp[i][mask], dp[i - 1][prevMask] + count);
                    }
                }
            }
        }

        int maxAns = 0;
        for (int mask = 0; mask < maxMask; mask++) {
            maxAns = Math.max(maxAns, dp[m][mask]);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        char[][] seats1 = {
            {'#', '.', '#', '#', '.', '#'},
            {'.', '#', '#', '#', '#', '.'},
            {'#', '.', '#', '#', '.', '#'}
        };
        System.out.println("Max Students (Seats 1): " + maxStudents(seats1));

        char[][] seats2 = {
            {'.', '#'},
            {'#', '#'},
            {'#', '.'},
            {'#', '#'},
            {'.', '#'}
        };
        System.out.println("Max Students (Seats 2): " + maxStudents(seats2));
    }
}
