import java.util.Arrays;
import java.util.Scanner;

public class P23_ArrangeAscendingDescending {
    public static void arrange(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int mid = n / 2;

        // Reverse the second half
        int left = mid, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        arrange(arr);
        System.out.println("Arranged Array: " + Arrays.toString(arr));
        sc.close();
    }
}
