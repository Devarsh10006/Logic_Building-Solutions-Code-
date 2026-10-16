import java.util.Scanner;

public class P19_SnakePatternMatrix {
    public static void printSnake(int n) {
        int val = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d ", val++);
                }
            } else {
                int endVal = val + n - 1;
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d ", endVal - j);
                }
                val += n;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N (e.g. 5): ");
        int n = sc.nextInt();
        printSnake(n);
        sc.close();
    }
}
