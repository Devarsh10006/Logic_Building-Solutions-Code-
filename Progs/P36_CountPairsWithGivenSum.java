import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P36_CountPairsWithGivenSum {
    public static int getPairsCount(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int x : arr) {
            int complement = k - x;
            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target sum K: ");
        int k = sc.nextInt();

        System.out.println("Number of pairs: " + getPairsCount(arr, k));
        sc.close();
    }
}
