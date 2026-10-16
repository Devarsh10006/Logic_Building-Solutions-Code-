import java.math.BigInteger;
import java.util.Scanner;

public class P54_BigNumberSum {
    public static BigInteger calculateTotal(int d, int n) {
        BigInteger total = BigInteger.ZERO;
        String prefix = String.valueOf(d);

        for (int i = 1; i <= n; i++) {
            String suffix = String.valueOf(i);
            int zeroCount = 11 - prefix.length() - suffix.length();
            if (zeroCount < 0) zeroCount = 0;
            StringBuilder sb = new StringBuilder(prefix);
            for (int z = 0; z < zeroCount; z++) sb.append('0');
            sb.append(suffix);

            total = total.add(new BigInteger(sb.toString()));
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter D: ");
        int d = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        System.out.println("Output: " + calculateTotal(d, n));
        sc.close();
    }
}
