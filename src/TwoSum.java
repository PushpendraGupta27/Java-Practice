import java.util.ArrayList;
import java.util.Collections;

public class TwoSum {
    /* You are given two arrays of digits a and b. Each array represents a number.
       Write a program to add the two numbers and print the result as a list of digits. */

    public static void main(String[] args) {
        int[] a = {2, 3, 9};
        int[] b = {5, 8, 7, 6};

        // ---------- First Approach: Digit-wise addition ----------
        ArrayList<Integer> ans = getIntegers(a, b);

        Collections.reverse(ans);
        System.out.println("First Approach (Digit-wise): " + ans);

        // ---------- Second Approach: Convert to int, sum, and split digits ----------
        int resultA = 0;
        for (int k : a) {
            resultA = resultA * 10 + k;
        }

        int resultB = 0;
        for (int k : b) {
            resultB = resultB * 10 + k;
        }

        int sum = resultA + resultB;

        // Edge case: if sum is 0
        if (sum == 0) {
            System.out.println("Second Approach (Converted Int): [0]");
            return;
        }

        // Count digits
        int temp = sum;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // Convert integer sum to digit array
        int[] result = new int[count];
        for (int k = count - 1; k >= 0; k--) {
            result[k] = sum % 10;
            sum /= 10;
        }

        // Print the result
        System.out.print("Second Approach (Converted Int): [");
        for (int k = 0; k < result.length; k++) {
            System.out.print(result[k]);
            if (k != result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    private static ArrayList<Integer> getIntegers(int[] a, int[] b) {
        int i = a.length - 1;
        int j = b.length - 1;

        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 0;

        while (i >= 0 && j >= 0) {
            int temp = a[i] + b[j] + carry;
            carry = temp / 10;
            ans.add(temp % 10);
            i--;
            j--;
        }

        while (i >= 0) {
            int temp = a[i] + carry;
            carry = temp / 10;
            ans.add(temp % 10);
            i--;
        }

        while (j >= 0) {
            int temp = b[j] + carry;
            carry = temp / 10;
            ans.add(temp % 10);
            j--;
        }

        if (carry > 0) {
            ans.add(carry);
        }
        return ans;
    }
}

