import java.util.Scanner;

public class P20_ConcentricSquarePattern {
    public static void printConcentric(int n) {
        int size = 2 * n - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int dist = Math.min(Math.min(i, size - 1 - i), Math.min(j, size - 1 - j));
                System.out.print((n - dist) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (e.g. 4): ");
        int n = sc.nextInt();
        printConcentric(n);
        sc.close();
    }
}
