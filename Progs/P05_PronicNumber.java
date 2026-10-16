import java.util.Scanner;

public class P05_PronicNumber {
    public static boolean isPronic(int n) {
        if (n < 0) return false;
        int k = (int) Math.sqrt(n);
        return k * (k + 1) == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isPronic(n) ? n + " is a Pronic number" : n + " is not a Pronic number");
        sc.close();
    }
}
