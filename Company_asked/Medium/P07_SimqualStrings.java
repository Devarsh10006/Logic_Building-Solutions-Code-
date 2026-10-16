import java.util.Arrays;
import java.util.Scanner;

public class P07_SimqualStrings {
    public static boolean areSimqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        if (areSimqual(s1, s2)) {
            System.out.println("Strings are Simqual");
        } else {
            System.out.println("Strings are NOT Simqual");
        }
        sc.close();
    }
}
