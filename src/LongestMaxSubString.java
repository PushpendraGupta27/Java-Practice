public class LongestMaxSubString {
    public static void main(String[] args) {
        String s = "1111122235666789";

        char maxChar = s.charAt(0); // the digit with longest repeat
        int maxLen = 1;

        char currentChar = s.charAt(0); // tracking current group
        int currentLen = 1;

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == currentChar) {
                currentLen++;
            } else {
                // Compare and update the max
                if (currentLen > maxLen || (currentLen == maxLen && currentChar > maxChar)) {
                    maxLen = currentLen;
                    maxChar = currentChar;
                }
                // Reset for next group
                currentChar = ch;
                currentLen = 1;
            }
        }

        // Final group check
        if (currentLen > maxLen || (currentLen == maxLen && currentChar > maxChar)) {
            maxLen = currentLen;
            maxChar = currentChar;
        }

        // Print result
        System.out.print("Longest largest substring: ");
        for (int i = 0; i < maxLen; i++) {
            System.out.print(maxChar);
        }
        System.out.println();
    }
}
