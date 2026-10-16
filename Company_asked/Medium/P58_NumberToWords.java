import java.util.Scanner;

public class P58_NumberToWords {
    private static final String[] ONES = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int n) {
        if (n == 0) return "zero";
        StringBuilder sb = new StringBuilder();

        if (n >= 1000) {
            sb.append(ONES[n / 1000]).append(" thousand ");
            n %= 1000;
        }

        if (n >= 100) {
            sb.append(ONES[n / 100]).append(" hundred ");
            n %= 100;
        }

        if (n >= 20) {
            sb.append(TENS[n / 10]);
            if (n % 10 > 0) {
                sb.append("-").append(ONES[n % 10]);
            }
        } else if (n > 0) {
            sb.append(ONES[n]);
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (1-9999): ");
        int n = sc.nextInt();
        System.out.println("In words: " + convert(n));
        sc.close();
    }
}
