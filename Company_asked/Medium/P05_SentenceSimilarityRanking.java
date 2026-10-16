import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SentenceScore {
    String sentence;
    int score;

    SentenceScore(String sentence, int score) {
        this.sentence = sentence;
        this.score = score;
    }
}

public class P05_SentenceSimilarityRanking {
    public static int calcSentenceScore(String sentence, String secret) {
        int total = 0;
        String[] words = sentence.split("\\s+");
        for (String w : words) {
            String cleanWord = w.replaceAll("[^a-zA-Z]", "");
            if (cleanWord.length() == secret.length()) {
                int wordScore = 0;
                for (int i = 0; i < secret.length(); i++) {
                    if (Character.toLowerCase(cleanWord.charAt(i)) == Character.toLowerCase(secret.charAt(i))) {
                        wordScore++;
                    }
                }
                total += wordScore;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String secretWord = "cat";
        String[] sentences = {
            "I love my pet",
            "A car ran fast",
            "He bought a hat",
            "The cat sat on the mat"
        };

        List<SentenceScore> list = new ArrayList<>();
        for (String s : sentences) {
            list.add(new SentenceScore(s, calcSentenceScore(s, secretWord)));
        }

        Collections.sort(list, (a, b) -> b.score - a.score);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) sb.append(" ");
            sb.append(list.get(i).sentence);
        }

        System.out.println("Final Decoded String = \"" + sb.toString() + "\"");
    }
}
