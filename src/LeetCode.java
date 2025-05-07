import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {
        code389();
    }

    private static char code389() {
        String t = "abedk";
        String s = "abkd";

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        // 1. Brute force
        for (char c : tc) {
            boolean isFound = false;
            for (char value : sc) {
                if (c == value) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Brute Force Result: " + c);
            }
        }

        // 2. ASCII sum
        int sumtc = 0, sumsc = 0;
        for (char c : tc) sumtc += c;
        for (char c : sc) sumsc += c;
        System.out.println("ASCII Sum Result: " + (char) (sumtc - sumsc));

        // 3. XOR
        int xor = 0;
        for (char c : sc) xor ^= c;
        for (char c : tc) xor ^= c;
        System.out.println("XOR Result: " + (char) xor);

        // 4. HashMap
        Map<Character, Integer> map = new HashMap<>();
        for (char c : sc) map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : tc) {
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) {
                System.out.println("HashMap Result: " + c);
                return c;
            }
        }

        return ' ';
    }
}
