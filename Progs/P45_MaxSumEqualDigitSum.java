import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P45_MaxSumEqualDigitSum {
    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int maximumSum(int[] nums) {
        Map<Integer, Integer> maxForSum = new HashMap<>();
        int maxTotal = -1;

        for (int x : nums) {
            int dSum = digitSum(x);
            if (maxForSum.containsKey(dSum)) {
                maxTotal = Math.max(maxTotal, maxForSum.get(dSum) + x);
                maxForSum.put(dSum, Math.max(maxForSum.get(dSum), x));
            } else {
                maxForSum.put(dSum, x);
            }
        }
        return maxTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.println("Maximum sum: " + maximumSum(nums));
        sc.close();
    }
}
