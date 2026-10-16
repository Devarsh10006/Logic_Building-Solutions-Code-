import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P35_CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        int duplicateCount = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCount++;
                System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
            }
        }
        System.out.println("Total duplicate numbers count: " + duplicateCount);
        sc.close();
    }
}
