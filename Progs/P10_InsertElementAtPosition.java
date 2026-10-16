import java.util.Scanner;

public class P10_InsertElementAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of current elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 10]; // Capacity allocated in advance
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();
        System.out.print("Enter position (0 to " + n + "): ");
        int pos = sc.nextInt();

        // Shift elements to right
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = element;
        n++;

        System.out.print("Array after insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
