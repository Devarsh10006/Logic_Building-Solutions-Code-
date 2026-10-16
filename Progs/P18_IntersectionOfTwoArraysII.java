import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P18_IntersectionOfTwoArraysII {
    public static List<Integer> intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int x : nums2) {
            if (map.containsKey(x) && map.get(x) > 0) {
                result.add(x);
                map.put(x, map.get(x) - 1);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter first array: ");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter second array: ");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        System.out.println("Intersection: " + intersect(a, b));
        sc.close();
    }
}
