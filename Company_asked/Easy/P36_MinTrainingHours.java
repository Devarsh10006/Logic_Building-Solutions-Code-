import java.util.Arrays;
import java.util.Scanner;

public class P36_MinTrainingHours {
    public static int minTrainingHours(int[] skills) {
        if (skills.length < 2) return 0;
        Arrays.sort(skills);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < skills.length; i++) {
            int diff = skills[i] - skills[i - 1];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] skills = new int[n];
        System.out.println("Enter skill levels: ");
        for (int i = 0; i < n; i++) skills[i] = sc.nextInt();

        System.out.println("Minimum training hours: " + minTrainingHours(skills));
        sc.close();
    }
}
