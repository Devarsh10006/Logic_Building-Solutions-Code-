import java.util.Scanner;

public class P55_TimeInWords {
    private static final String[] NUMS = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
        "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", "twenty-five",
        "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine"
    };

    public static String timeInWords(int h, int m) {
        if (m == 0) {
            return NUMS[h] + " o' clock";
        } else if (m == 15) {
            return "quarter past " + NUMS[h];
        } else if (m == 30) {
            return "half past " + NUMS[h];
        } else if (m == 45) {
            int nextH = (h % 12) + 1;
            return "quarter to " + NUMS[nextH];
        } else if (m < 30) {
            String unit = (m == 1) ? "minute" : "minutes";
            return NUMS[m] + " " + unit + " past " + NUMS[h];
        } else {
            int rem = 60 - m;
            int nextH = (h % 12) + 1;
            String unit = (rem == 1) ? "minute" : "minutes";
            return NUMS[rem] + " " + unit + " to " + NUMS[nextH];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours (1-12): ");
        int h = sc.nextInt();
        System.out.print("Enter minutes (0-59): ");
        int m = sc.nextInt();

        System.out.println("Time in Words: " + timeInWords(h, m));
        sc.close();
    }
}
