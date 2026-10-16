import java.util.Scanner;

public class P37_KthElementSortedArrays {
    public static int findKthElement(int[] a, int[] b, int k) {
        int i = 0, j = 0, count = 0;
        int current = -1;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                current = a[i++];
            } else {
                current = b[j++];
            }
            count++;
            if (count == k) return current;
        }

        while (i < a.length) {
            current = a[i++];
            count++;
            if (count == k) return current;
        }

        while (j < b.length) {
            current = b[j++];
            count++;
            if (count == k) return current;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("Enter first sorted array: ");
        for (int i = 0; i < m; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of second sorted array: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter second sorted array: ");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        System.out.println("K-th element: " + findKthElement(a, b, k));
        sc.close();
    }
}
