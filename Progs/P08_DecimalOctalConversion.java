import java.util.Scanner;

public class P08_DecimalOctalConversion {
    public static String decimalToOctal(int dec) {
        return Integer.toOctalString(dec);
    }

    public static int octalToDecimal(String oct) {
        return Integer.parseInt(oct, 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int dec = sc.nextInt();
        String oct = decimalToOctal(dec);
        System.out.println("Decimal to Octal: " + oct);

        System.out.print("Enter octal number: ");
        String octInput = sc.next();
        System.out.println("Octal to Decimal: " + octalToDecimal(octInput));
        sc.close();
    }
}
