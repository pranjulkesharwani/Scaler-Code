public class Toggel {
    private boolean isLower(char ch) {
        if ('a' <= ch && ch <= 'z') {
            return true;
        }
        return false;
    }

    public String solve(String A) {
        int n = A.length();
        StringBuilder sb = new StringBuilder();
        int diff = 'a' - 'A';
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);

            if (isLower(ch)) {
                char upper = (char) (ch - diff);
                sb.append(upper);
            } else {
                char lower = (char) (ch + diff);
                sb.append(lower);
            }
        }
        return sb.toString();
    }
}
