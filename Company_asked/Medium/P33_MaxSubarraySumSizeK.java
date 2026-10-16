import java.util.Scanner;

public class P33_MaxSubarraySumSizeK {
    public static int maxSubarraySumK(int[] arr, int k) {
        if (arr.length < k || k <= 0) return 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter K: ");
        int k = sc.nextInt();

        System.out.println("Maximum Sum of subarray of size " + k + ": " + maxSubarraySumK(arr, k));
        sc.close();
    }
}
