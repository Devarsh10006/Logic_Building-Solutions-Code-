import java.util.Scanner;

public class P67_StringToIntegerAtoi {
    public static int myAtoi(String s) {
        if (s == null) return 0;
        int i = 0, n = s.length();

        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        // 2. Determine sign
        int sign = 1;
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Read digits and clamp to 32-bit signed integer range
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign * result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Parsed Integer: " + myAtoi(s));
        sc.close();
    }
}
