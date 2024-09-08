public class KthMissingInteger {
    public static void main(String[] args) {
        int[] A = { 2, 3, 4, 7, 11 };

        int B = 5;
        System.out.println(findKthMissingInteger(A, B));
    }

    private static int countMissingUpTo(int[] A, int index) {
        return A[index] - (index + 1);
    }

    public static int findKthMissingInteger(int[] A, int B) {
        int n = A.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (countMissingUpTo(A, mid) < B) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        int missingBeforeHigh = countMissingUpTo(A, high);

        if (high == -1)
            return B;
        else {
            return A[high] + (B - missingBeforeHigh);
        }
    }
}
