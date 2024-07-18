public class ReverserWord {
    public String solve(String A) {
        A = A.trim();
        String[] words = A.split(" ");
        int l = 0;
        int r = words.length - 1;

        while (l < r) {
            String temp = words[l];
            words[l] = words[r];
            words[r] = temp;

            l++;
            r--;
        }
        return String.join(" ", words);
    }
}
