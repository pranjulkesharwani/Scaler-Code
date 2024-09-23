import java.util.Stack;

public class LowerTemperature {
    public int[] lowerTemperature(int[] A) {
        int n = A.length;

        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && A[i] < A[stack.peek()]) {
                int index = stack.pop();

                res[index] = i - index;

            }
            stack.push(i);
        }
        return res;
    }
}
