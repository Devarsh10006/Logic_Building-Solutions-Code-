import java.util.Scanner;

public class P46_SquareRootInteger {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long low = 1, high = x, ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer x: ");
        int x = sc.nextInt();
        System.out.println("Square root: " + mySqrt(x));
        sc.close();
    }
}
