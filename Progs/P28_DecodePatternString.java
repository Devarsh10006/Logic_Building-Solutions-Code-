import java.util.Scanner;

public class P28_DecodePatternString {
    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0, n = s.length();

        while (i < n) {
            if (Character.isDigit(s.charAt(i))) {
                int count = 0;
                while (i < n && Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }
                if (i < n) {
                    char ch = s.charAt(i++);
                    for (int k = 0; k < count; k++) {
                        result.append(ch);
                    }
                }
            } else {
                result.append(s.charAt(i++));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encoded pattern (e.g. 2a3bc4dE5F2G7H): ");
        String s = sc.nextLine();
        System.out.println("Expanded String: " + decode(s));
        sc.close();
    }
}
