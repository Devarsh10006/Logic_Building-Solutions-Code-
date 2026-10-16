import java.util.Arrays;
import java.util.Scanner;

public class P44_NextPermutationString {
    public static String nextPermutation(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int i = n - 2;

        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }

        if (i < 0) {
            return "No greater permutation possible";
        }

        int j = n - 1;
        while (a[j] <= a[i]) {
            j--;
        }

        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

        Arrays.sort(a, i + 1, n);
        return new String(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Next lexicographical string: " + nextPermutation(s));
        sc.close();
    }
}
