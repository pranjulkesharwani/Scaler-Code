import java.util.Set;
import java.util.HashSet;

public class LongestCommonPrefix {
    private boolean allMatching(String[] words, int i) {
        Set<Character> set = new HashSet<>();

        for (String word : words) {
            char ch = word.charAt(i);
            set.add(ch);
        }
        return set.size() == 1;
    }

    public String longestCommonePrefix(String[] A) {
        StringBuilder sb = new StringBuilder();

        int minLength = Integer.MAX_VALUE;

        for (String word : A) {
            minLength = Math.min(minLength, word.length());
        }

        for (int i = 0; i < minLength; i++) {
            char ch = A[0].charAt(i);
            if (allMatching(A, i)) {
                sb.append(ch);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
