import java.util.Scanner;

public class P09_DecimalHexConversion {
    public static String decimalToHex(int dec) {
        return Integer.toHexString(dec).toUpperCase();
    }

    public static int hexToDecimal(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int dec = sc.nextInt();
        String hex = decimalToHex(dec);
        System.out.println("Decimal to Hexadecimal: " + hex);

        System.out.print("Enter hexadecimal number: ");
        String hexInput = sc.next();
        System.out.println("Hexadecimal to Decimal: " + hexToDecimal(hexInput));
        sc.close();
    }
}
