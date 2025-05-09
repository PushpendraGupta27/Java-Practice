import java.util.ArrayList;
import java.util.Collections;

public class TwoSum {
    /*You are given two arrays of digits a and b. Each array represents a number.
    Write a program to add the two numbers and print the result as a list of digits.*/

    public static void main(String[] args) {
        int[] a = {2, 3, 9};
        int[] b = {5, 8, 7, 6};

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

        Collections.reverse(ans);
        System.out.println(ans);
    }
}
