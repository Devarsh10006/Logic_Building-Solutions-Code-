import java.util.Arrays;
import java.util.Scanner;

public class P26_RearrangeAlternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = arr[right--];
            } else {
                result[i] = arr[left++];
            }
        }

        System.out.println("Rearranged Array: " + Arrays.toString(result));
        sc.close();
    }
}
