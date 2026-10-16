import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P68_SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        int sum = 0;

        for (int x : nums) {
            sum += x;
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.print("Enter target sum K: ");
        int k = sc.nextInt();

        System.out.println("Total Subarrays with Sum " + k + ": " + subarraySum(nums, k));
        sc.close();
    }
}
