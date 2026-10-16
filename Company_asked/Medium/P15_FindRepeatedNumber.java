import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P15_FindRepeatedNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (seen.contains(x)) {
                return x;
            }
            seen.add(x);
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

        System.out.println("Repeated Number: " + findDuplicate(nums));
        sc.close();
    }
}
