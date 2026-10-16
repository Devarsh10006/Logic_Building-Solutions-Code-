import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P22_NthFactor {
    public static int findNthFactor(int num, int k) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                factors.add(i);
                if (i != num / i) {
                    factors.add(num / i);
                }
            }
        }
        Collections.sort(factors);
        if (k > 0 && k <= factors.size()) {
            return factors.get(k - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter N: ");
        int k = sc.nextInt();
        int res = findNthFactor(num, k);
        System.out.println("Nth Factor: " + res);
        sc.close();
    }
}
