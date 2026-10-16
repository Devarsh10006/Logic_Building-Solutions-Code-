import java.util.Scanner;

public class P40_MedianOfTwoSortedArrays {
    public static double getMedian(int[] a, int[] b, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;

        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = b[j++];
            } else if (j == n) {
                m1 = m2;
                m2 = a[i++];
            } else if (a[i] <= b[j]) {
                m1 = m2;
                m2 = a[i++];
            } else {
                m1 = m2;
                m2 = b[j++];
            }
        }
        return (m1 + m2) / 2.0;
    }

    public static void main(String[] args) {
        int[] a = {1, 12, 15, 26, 38};
        int[] b = {2, 13, 17, 30, 45};
        System.out.println("Median = " + (int) getMedian(a, b, a.length));
    }
}
