import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Basic_Operations {
    //    private static final int[] array = {4, 6, 9, 5, 2, 3};
    private static final int[] array = {2, 3, 4, 5, 6, 9};
    static Scanner scn = new Scanner(System.in);

    private static void questions() {
        int sum = 0;
        int min = array[0];
        int max = array[0];
        int temp;
        int len = array.length;
        boolean isSorted = true;

        System.out.print("Enter a element which you want to search: ");
        int num = scn.nextInt();
        int index = -1;

        for (int i = 0; i <= len - 1; i++) {
            // Find the sum of all elements in an array.
            sum = array[i] + sum;

            // Find the maximum and minimum elements in an array.
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }

            // Search for an element in an array (linear search).
            if (array[i] == num) {
                index = i;
            }

            // Check if an array is sorted in ascending order.
            if (i < len - 1 && array[i] > array[i + 1]) {
                isSorted = false;
            }
        }

        if (index != -1) {
            System.out.println("Given element is in array index of: " + index);
        } else {
            System.out.println("Given element is not found in array.");
        }

        System.out.println("Sum of all elements in an array is " + sum);

        // Find the average of all elements in an array.
        int avg = sum / len;
        System.out.println("Average of all elements in an array is " + avg);

        System.out.println("maximum and minimum elements are " + max + "," + min);

        // Reverse an array.
        for (int i = 0; i < len / 2; i++) {
            temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

        if (isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("array is not sorted in ascending order");
        }
    }

    public static void main(String[] args) {
        questions();
    }
}
