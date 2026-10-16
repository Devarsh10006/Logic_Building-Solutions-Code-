import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P38_AscendingTripleOccurrence {
    public static int checkCondition(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        // 1. Check ascending order
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return 0;
            }
        }

        // 2. Check each distinct number occurs at least 3 times
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : arr) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for (int count : freq.values()) {
            if (count < 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 1, 1, 2, 2};
        int[] a2 = {1, 1, 1, 3, 3, 3, 3};

        System.out.println("Result for [1,1,1,2,2]: " + checkCondition(a1));
        System.out.println("Result for [1,1,1,3,3,3,3]: " + checkCondition(a2));
    }
}
