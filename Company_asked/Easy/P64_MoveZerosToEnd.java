import java.util.Arrays;
import java.util.Scanner;

public class P64_MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int x : nums) {
            if (x != 0) {
                nums[insertPos++] = x;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        moveZeroes(arr);
        System.out.println("Result: " + Arrays.toString(arr));
        sc.close();
    }
}
