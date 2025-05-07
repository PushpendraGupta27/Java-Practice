public class LeetCode {
    public static void main(String[] args) {
        code389();
    }

    private static void code389() {

        String t = "abedk";
        String s = "abkd";

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        // brute force
        for (char c : tc) {
            boolean isFound = false;
            for (char value : sc) {
                if (c == value) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Result " + c);
            }
        }
    }
}
