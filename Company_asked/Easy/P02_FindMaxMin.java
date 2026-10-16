import java.util.Scanner;

public class P02_FindMaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

        for (int x : arr) {
            if (x > max) {
                secondMax = max;
                max = x;
            } else if (x > secondMax && x != max) {
                secondMax = x;
            }

            if (x < min) {
                secondMin = min;
                min = x;
            } else if (x < secondMin && x != min) {
                secondMin = x;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + (secondMax == Integer.MIN_VALUE ? "None" : secondMax));
        System.out.println("Minimum: " + min);
        System.out.println("Second Minimum: " + (secondMin == Integer.MAX_VALUE ? "None" : secondMin));
        sc.close();
    }
}
