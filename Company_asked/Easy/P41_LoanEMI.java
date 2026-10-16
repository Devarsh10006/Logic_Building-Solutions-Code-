import java.util.Scanner;

public class P41_LoanEMI {
    public static double calculateEMI(double p, double rAnnual, int nMonths) {
        double r = rAnnual / (12 * 100);
        double emi = (p * r * Math.pow(1 + r, nMonths)) / (Math.pow(1 + r, nMonths) - 1);
        return emi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        double p = sc.nextDouble();
        System.out.print("Enter annual interest rate (R): ");
        double r = sc.nextDouble();
        System.out.print("Enter loan tenure in months (N): ");
        int n = sc.nextInt();

        double emi = calculateEMI(p, r, n);
        System.out.printf("The EMI per month is: %.2f%n", emi);
        sc.close();
    }
}
