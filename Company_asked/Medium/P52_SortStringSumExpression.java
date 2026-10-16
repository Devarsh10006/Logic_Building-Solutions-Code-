import java.util.Arrays;
import java.util.Scanner;

public class P52_SortStringSumExpression {
    public static String sortExpression(String expr) {
        String[] parts = expr.split("\\+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) sb.append("+");
            sb.append(nums[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression (e.g. 3+2+1): ");
        String s = sc.nextLine();
        System.out.println("Sorted Expression: " + sortExpression(s));
        sc.close();
    }
}
