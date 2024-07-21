public class SuperStreamEngineers {
    public int solve(int[] A, int B, int C) {
        long total = 0;
        int n = A.length;

        for (int i = 0; i <= B - 1; i++) {
            total = A[i];
        }
        if ((total / B) < C)
            return 1;

        int left = 0;
        for (int i = B; i < n; i++) {
            total += A[i];
            total -= A[left];
            left++;

            if ((total / B) <= C)
                return 1;
        }
        return 0;
    }
}

// public class SuperStreamEngineers{
// public int solve(int[] A, int windows, int limit){
// int n = A.length;
// long total = 0;

// for(int i=0; i<windows-1; i++){
// total += A[i];
// }

// if((total/B)<= limit) return 1;

// int left = 0;
// for(int right = windows; right<n; right++){
// total += A[right];
// total -= A[left];
// left++;

// if((total/B) <= limit) return 1;
// }
// return 0;
// }
// }