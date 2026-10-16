import java.util.Scanner;

public class P25_ChocolateWrapperProblem {
    public static int countChocolates(int nRupees, int price, int kWrappers) {
        int chocolates = nRupees / price;
        int wrappers = chocolates;

        while (wrappers >= kWrappers) {
            int newChoc = wrappers / kWrappers;
            chocolates += newChoc;
            wrappers = (wrappers % kWrappers) + newChoc;
        }
        return chocolates;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter money (N): ");
        int n = sc.nextInt();
        System.out.print("Enter price per chocolate (M): ");
        int m = sc.nextInt();
        System.out.print("Enter wrappers needed for 1 chocolate (K): ");
        int k = sc.nextInt();

        System.out.println("Total chocolates eaten: " + countChocolates(n, m, k));
        sc.close();
    }
}
