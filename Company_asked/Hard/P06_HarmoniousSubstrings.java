import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_HarmoniousSubstrings {
    public static boolean isHarmonious(String s) {
        int[] freq = new int[256];
        for (char ch : s.toCharArray()) {
            freq[ch]++;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int f : freq) {
            if (f > 0) {
                if (f < min) min = f;
                if (f > max) max = f;
            }
        }
        return (max - min) <= 1;
    }

    public static List<String> findHarmoniousSubstrings(String str) {
        List<String> result = new ArrayList<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                if (isHarmonious(sub)) {
                    result.add(sub);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        List<String> res = findHarmoniousSubstrings(s);
        System.out.println("Harmonious Substrings: " + res);
        sc.close();
    }
}
