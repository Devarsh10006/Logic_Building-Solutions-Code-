import java.util.Scanner;

public class P34_SecondLargestDistinct {
    public static int getSecondLargest(int[] arr) {
        int max = -1, secondMax = -1;
        for (int x : arr) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x != max) {
                secondMax = x;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter positive integers: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Second largest element: " + getSecondLargest(arr));
        sc.close();
    }
}
