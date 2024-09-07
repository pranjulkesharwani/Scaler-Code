import java.util.HashMap;

public class KingAndPalindromes {
    public static void main(String[] args) {
        System.out.println(freqCount("banana"));

    }

    public static int freqCount(String A) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : A.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        int ans = 0;
        int hasOdd = 0;
        for (int freq : hm.values()) {
            if (freq % 2 == 0) {
                ans += freq;
            } else {
                ans += (freq - 1);
                hasOdd = 1;
            }
        }
        // for (int freq : hm.values()) {
        // ans += freq - (freq & 1);
        // hasOdd = freq | (freq & 1);
        // }
        return ans + hasOdd;
    }
}
