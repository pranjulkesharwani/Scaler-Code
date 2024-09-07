import java.util.ArrayList;
import java.util.Collections;

public class DecreasingOrderWords {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        A.add("cow");
        A.add("could");
        A.add("bat");
        A.add("cat");

        System.out.println(solve(A));
    }

    public static ArrayList<String> solve(ArrayList<String> A) {
        Collections.sort(A, (a, b) -> {
            if (a.length() > b.length())
                return -1;
            else if (b.length() > a.length())
                return 1;
            else
                return 0;
        });

        return A;
    }
}
