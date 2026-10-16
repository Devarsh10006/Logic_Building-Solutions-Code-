import java.util.Scanner;

public class P42_ReverseFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            sc.close();
            return;
        }

        long[] fib = new long[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.print("Fibonacci series in reverse: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
