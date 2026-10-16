import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P25_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        boolean found = false;
        for (int x : arr) {
            int complement = target - x;
            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + complement + " + " + x + " = " + target);
                found = true;
                break;
            }
            map.put(x, 1);
        }

        if (!found) {
            System.out.println("No pair with given sum found.");
        }
        sc.close();
    }
}
