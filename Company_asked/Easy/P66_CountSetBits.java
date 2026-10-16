import java.util.Scanner;

public class P66_CountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        System.out.println("Number of set bits: " + countSetBits(n));
        sc.close();
    }
}
