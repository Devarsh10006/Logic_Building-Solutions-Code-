import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P48_MergeArraysUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter first array elements: ");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter second array elements: ");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        Set<Integer> unique = new LinkedHashSet<>();
        for (int x : a) unique.add(x);
        for (int x : b) unique.add(x);

        System.out.println("Merged Array (without duplicates): " + unique);
        sc.close();
    }
}
