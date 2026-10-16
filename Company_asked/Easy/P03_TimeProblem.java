import java.util.Scanner;

class Time {
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    void addSeconds(int seconds) {
        sec += seconds;
        min += sec / 60;
        sec %= 60;
        hr += min / 60;
        min %= 60;
    }

    void subtractSeconds(int seconds) {
        int totalSeconds = hr * 3600 + min * 60 + sec - seconds;
        if (totalSeconds < 0) totalSeconds = 0;
        hr = totalSeconds / 3600;
        totalSeconds %= 3600;
        min = totalSeconds / 60;
        sec = totalSeconds % 60;
    }

    void printTime() {
        System.out.printf("%02d : %02d : %02d%n", hr, min, sec);
    }
}

public class P03_TimeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hr = sc.nextInt();
        System.out.print("Enter minutes: ");
        int min = sc.nextInt();
        System.out.print("Enter seconds: ");
        int sec = sc.nextInt();

        Time time = new Time(hr, min, sec);

        System.out.print("Enter seconds to add: ");
        int add = sc.nextInt();
        time.addSeconds(add);
        System.out.print("Time after adding seconds = ");
        time.printTime();

        System.out.print("Enter seconds to subtract: ");
        int sub = sc.nextInt();
        time.subtractSeconds(sub);
        System.out.print("Time after subtracting seconds = ");
        time.printTime();

        sc.close();
    }
}
