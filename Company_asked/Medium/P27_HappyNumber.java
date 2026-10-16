import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P27_HappyNumber {
    public static int sumOfDigitSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfDigitSquares(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isHappy(n) ? n + " is a Happy number" : n + " is not a Happy number");
        sc.close();
    }
}
