import java.util.ArrayList;

public class SubArrays {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        int n = A.size();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                ArrayList<Integer> subarrays = new ArrayList<>();
                for (int i = l; i < r; i++) {
                    subarrays.add(A.get(i));
                }
                ans.add(subarrays);
            }
        }
        return ans;
    }
}
