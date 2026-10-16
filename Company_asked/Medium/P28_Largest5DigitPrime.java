import java.util.Scanner;

public class P28_Largest5DigitPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static int countDigit(int num, int d) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == d) count++;
            num /= 10;
        }
        return count;
    }

    public static int findLargest5DigitPrime(int digit) {
        for (int num = 99999; num >= 10000; num--) {
            if (countDigit(num, digit) == 2 && isPrime(num)) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit (0-9): ");
        int d = sc.nextInt();
        System.out.println("Largest 5-digit prime: " + findLargest5DigitPrime(d));
        sc.close();
    }
}
