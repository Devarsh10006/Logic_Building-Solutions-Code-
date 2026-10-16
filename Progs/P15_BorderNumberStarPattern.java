import java.util.Scanner;

public class P15_BorderNumberStarPattern {
    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("1");
            } else if (i == 2) {
                System.out.println("1 2 1");
            } else {
                System.out.print("1 ");
                for (int s = 1; s <= i - 2; s++) System.out.print("* ");
                System.out.print(i + " ");
                for (int s = 1; s <= i - 2; s++) System.out.print("* ");
                System.out.println("1");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (e.g. 6): ");
        int n = sc.nextInt();
        printPattern(n);
        sc.close();
    }
}
