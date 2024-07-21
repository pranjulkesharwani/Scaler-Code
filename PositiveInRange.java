public class PositiveInRange {
    public int[] solve(int[] A, int[][] queries) {
        int Q = queries.length;
        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] >= 0)
                A[i] = 1;
            else
                A[i] = 0;
        }

        for (int i = 1; i < n; i++) {
            A[i] += A[i - 1];
        }

        int[] ans = new int[Q];

        for (int q = 0; q < Q; q++) {
            int L = queries[q][0];
            int R = queries[q][1];

            int cnt = 0;

            if (L == 0)
                cnt = A[R];
            else
                cnt = A[R] - A[L - 1];
            ans[q] = cnt;
        }

        return ans;
    }
}

// public class PositiveInRange{
// public int[] solve(int[] A, int[][] queries){
// int Q = queries.length;
// int n = A.length;

// for(int i=0; i<n; i++){
// if(A[i] >= 0) A[i] = 1;
// else A[i] = 0;
// }

// for(int i=1; i<n; i++){
// A[i] += A[i-1];
// }

// int[] ans = new int[Q];

// for(int q=0; q<n; q++){
// int L = queries[q][0];
// int R = queries[q][1];

// int cnt = 0;

// if(L == 0) cnt = A[R];
// else cnt = A[R] - A[L-1];

// ans[q] = cnt;
// }
// return ans;
// }
// }