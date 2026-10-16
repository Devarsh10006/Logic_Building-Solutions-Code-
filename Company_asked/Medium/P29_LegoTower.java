import java.util.Scanner;

public class P29_LegoTower {
    public static int maxTowerHeight(int[] red, int[] blue) {
        int n = red.length;
        if (n == 0) return 0;

        // Choice 1: Start with red at index 0
        int heightStartRed = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) heightStartRed += red[i];
            else heightStartRed += blue[i];
        }

        // Choice 2: Start with blue at index 0
        int heightStartBlue = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) heightStartBlue += blue[i];
            else heightStartBlue += red[i];
        }

        return Math.max(heightStartRed, heightStartBlue);
    }

    public static void main(String[] args) {
        int[] red1 = {3, 5, 2};
        int[] blue1 = {4, 1, 6};
        System.out.println("Output: " + maxTowerHeight(red1, blue1));

        int[] red2 = {2, 7, 4, 1};
        int[] blue2 = {3, 5, 6, 2};
        System.out.println("Output: " + maxTowerHeight(red2, blue2));
    }
}
