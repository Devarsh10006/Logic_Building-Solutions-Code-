import java.util.Arrays;
import java.util.Scanner;

public class P40_DiffSecondMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        // Find second smallest (first distinct element after arr[0])
        int secondMin = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[0]) {
                secondMin = arr[i];
                break;
            }
        }

        // Find second largest (first distinct element before arr[n-1])
        int secondMax = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[n - 1]) {
                secondMax = arr[i];
                break;
            }
        }

        if (secondMin != -1 && secondMax != -1) {
            System.out.println("Second Largest: " + secondMax);
            System.out.println("Second Smallest: " + secondMin);
            System.out.println("Difference: " + (secondMax - secondMin));
        } else {
            System.out.println("Not enough distinct elements.");
        }
        sc.close();
    }
}
