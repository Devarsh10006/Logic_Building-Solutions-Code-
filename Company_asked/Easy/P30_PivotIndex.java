import java.util.Scanner;

public class P30_PivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int x : nums) totalSum += x;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        System.out.println("Pivot Index: " + pivotIndex(nums));
        sc.close();
    }
}
