import java.util.Scanner;

public class P33_BinaryStringToFloat {
    public static double binaryToDecimal(String binStr) {
        String[] parts = binStr.split("\\.");
        int intPart = Integer.parseInt(parts[0], 2);

        double fracPart = 0.0;
        if (parts.length > 1) {
            String frac = parts[1];
            double weight = 0.5;
            for (int i = 0; i < frac.length(); i++) {
                if (frac.charAt(i) == '1') {
                    fracPart += weight;
                }
                weight /= 2.0;
            }
        }
        return intPart + fracPart;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string (e.g. 101.110): ");
        String s = sc.nextLine();
        System.out.println("Decimal equivalent: " + binaryToDecimal(s));
        sc.close();
    }
}
