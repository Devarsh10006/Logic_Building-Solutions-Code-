import java.util.Scanner;

public class P30_SearchInArrayRecursive {
    private static int searchHelper(int a[], int m, int index) {
        if (index >= a.length) {
            return 0; // Not present
        }
        if (a[index] == m) {
            return 1; // Present
        }
        return searchHelper(a, m, index + 1);
    }

    public static int isInArray(int a[], int m) {
        return searchHelper(a, m, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter element to search: ");
        int m = sc.nextInt();

        int res = isInArray(a, m);
        System.out.println("Is in array (1=Yes, 0=No): " + res);
        sc.close();
    }
}
