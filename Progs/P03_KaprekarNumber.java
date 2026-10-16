import java.util.Scanner;

public class P03_KaprekarNumber {
    public static boolean isKaprekar(int n) {
        if (n == 1) return true;
        long sq = (long) n * n;
        String s = String.valueOf(sq);
        int len = s.length();

        for (int i = 1; i < len; i++) {
            String leftStr = s.substring(0, i);
            String rightStr = s.substring(i);

            long left = Long.parseLong(leftStr);
            long right = Long.parseLong(rightStr);

            if (right > 0 && left + right == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isKaprekar(n) ? n + " is a Kaprekar number" : n + " is not a Kaprekar number");
        sc.close();
    }
}
