import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P27_LargestMultipleOfThree {
    public static String largestMultipleOfThree(int[] digits) {
        List<Integer> q0 = new ArrayList<>();
        List<Integer> q1 = new ArrayList<>();
        List<Integer> q2 = new ArrayList<>();
        int sum = 0;

        for (int d : digits) {
            sum += d;
            if (d % 3 == 0) q0.add(d);
            else if (d % 3 == 1) q1.add(d);
            else q2.add(d);
        }

        Collections.sort(q1);
        Collections.sort(q2);

        if (sum % 3 == 1) {
            if (!q1.isEmpty()) {
                q1.remove(0);
            } else if (q2.size() >= 2) {
                q2.remove(0);
                q2.remove(0);
            } else {
                return "";
            }
        } else if (sum % 3 == 2) {
            if (!q2.isEmpty()) {
                q2.remove(0);
            } else if (q1.size() >= 2) {
                q1.remove(0);
                q1.remove(0);
            } else {
                return "";
            }
        }

        List<Integer> all = new ArrayList<>();
        all.addAll(q0);
        all.addAll(q1);
        all.addAll(q2);
        all.sort(Collections.reverseOrder());

        if (all.isEmpty()) return "";
        if (all.get(0) == 0) return "0";

        StringBuilder sb = new StringBuilder();
        for (int d : all) sb.append(d);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter digits (0-9): ");
        for (int i = 0; i < n; i++) digits[i] = sc.nextInt();

        System.out.println("Largest multiple of 3: " + largestMultipleOfThree(digits));
        sc.close();
    }
}
