public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

    }

    public String longestPalindrome(String A) {
        int L = -1;
        int R = -1;

        int mlength = 0;
        int n = A.length();

        for (int c = 0; c < n; c++) {
            int l = c;
            int r = c;

            while (l >= 0 && r < n && A.charAt(l) == A.charAt(r)) {
                l--;
                r++;
            }
            int length = r - l - 1;

            if (length > mlength) {
                mlength = length;
                L = l + 1;
                R = r - 1;
            }

            // even
            l = c;
            r = c + 1;

            while (l >= 0 && r < n && A.charAt(l) == A.charAt(r)) {
                l--;
                r++;
            }

            length = r - l - 1;

            if (length > mlength) {
                length = mlength;
                L = l + 1;
                R = r - 1;
            }
        }

        return A.substring(L, R + 1);
    }
}