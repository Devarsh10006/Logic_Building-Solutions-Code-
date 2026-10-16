import java.util.Arrays;
import java.util.Scanner;

public class P51_CoinChangeMinCoins {
    public static int minCoins(int[] coins, int sum) {
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, sum + 1);
        dp[0] = 0;

        for (int i = 1; i <= sum; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[sum] > sum ? -1 : dp[sum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target sum: ");
        int sum = sc.nextInt();
        System.out.print("Enter number of coin denominations: ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter coin denominations: ");
        for (int i = 0; i < n; i++) coins[i] = sc.nextInt();

        System.out.println("Minimum coins required: " + minCoins(coins, sum));
        sc.close();
    }
}
