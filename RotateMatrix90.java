public class RotateMatrix90 {
    private void swap(int[][] A, int r, int c) {
        int temp = A[r][c];
        A[r][c] = A[c][r];
        A[c][r] = temp;
    }

    private void swap(int[] A, int r, int c) {
        int temp = A[r];
        A[r] = A[c];
        A[c] = temp;
    }

    public void solve(int[][] A) {
        int n = A.length;

        // Transpose the matrix
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r > c)
                    continue;
                swap(A, r, c);
            }
        }

        for (int r = 0; r < n; r++) {
            int s = 0;
            int e = n - 1;

            while (s < e) {
                swap(A[r], s, e);
                s++;
                e--;
            }
        }
    }
}
