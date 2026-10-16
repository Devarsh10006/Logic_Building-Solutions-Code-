import java.util.Arrays;
import java.util.Scanner;

public class P69_MinMovesEqualElements {
    public static int minMoves(int[] arr) {
        if (arr.length < 2) return 0;
        Arrays.sort(arr);
        int minMoves = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minMoves) {
                minMoves = diff;
            }
        }
        return minMoves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Minimum moves: " + minMoves(arr));
        sc.close();
    }
}
