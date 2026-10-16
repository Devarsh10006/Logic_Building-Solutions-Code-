import java.util.Scanner;

public class P07_ClockAngle {
    public static double findAngle(double h, double m) {
        if (h == 12) h = 0;
        if (m == 60) m = 0;

        double hourAngle = 0.5 * (h * 60 + m);
        double minuteAngle = 6 * m;

        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours (1-12): ");
        double h = sc.nextDouble();
        System.out.print("Enter minutes (0-59): ");
        double m = sc.nextDouble();

        System.out.println("Angle between hands: " + findAngle(h, m) + " degrees");
        sc.close();
    }
}
