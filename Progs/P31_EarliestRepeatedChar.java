import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P31_EarliestRepeatedChar {
    public static char earliestRepeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;
            }
            seen.add(ch);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        char ch = earliestRepeatedCharacter(s);
        if (ch != '\0') {
            System.out.println("Earliest repeated character: " + ch);
        } else {
            System.out.println("No repeated character found.");
        }
        sc.close();
    }
}
