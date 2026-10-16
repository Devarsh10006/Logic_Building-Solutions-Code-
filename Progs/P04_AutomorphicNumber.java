import java.util.Scanner;

public class P04_AutomorphicNumber {
    public static boolean isAutomorphic(int n) {
        long sq = (long) n * n;
        String nStr = String.valueOf(n);
        String sqStr = String.valueOf(sq);
        return sqStr.endsWith(nStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(isAutomorphic(n) ? n + " is an Automorphic number" : n + " is not an Automorphic number");
        sc.close();
    }
}
