import java.util.Scanner;

public class P41_TowerOfHanoi {
    public static void solveHanoi(int n, int from, int to, int aux) {
        if (n == 1) {
            System.out.println("move disk 1 from rod " + from + " to rod " + to);
            return;
        }
        solveHanoi(n - 1, from, aux, to);
        System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
        solveHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        solveHanoi(n, 1, 3, 2);
        long totalMoves = (1L << n) - 1;
        System.out.println("Total moves: " + totalMoves);
        sc.close();
    }
}
