import java.util.*;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Basic_Operations {
    private static final int[] array = {4, 6, 9, 5, 2, 3};
    private static final int[] arr = {1, 2, 2, 3, 4, 4, 5};
    private static final int[] newArr = new int[array.length];
    static Scanner scn = new Scanner(System.in);

    private static void questions() {
        int sum = 0;
        int min = array[0];
        int max = array[0];
        boolean isSorted = true;

        System.out.print("Enter an element you want to search: ");
        int num = scn.nextInt();
        int index = -1;
        int temp;
        int len = array.length;
        Set<Integer> set = new HashSet<>();


        for (int i = 0; i < len; i++) {
            // Sum of all elements
            sum += array[i];

            // Max and min
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }

            // Linear search
            if (array[i] == num && index == -1) {
                index = i;
            }

            // Check if array is sorted
            if (i < len - 1 && array[i] > array[i + 1]) {
                isSorted = false;
            }

            // Copy elements of one array into another array.
            newArr[i] = array[i];
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in array.");
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + (sum / len));
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        // Reverse the array
        for (int i = 0; i < len / 2; i++) {
            temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));

        System.out.println("copy array: " + Arrays.toString(newArr));

        // Remove duplicates from an array.
        for (int i = 0; i < arr.length - 1; i++) {
            set.add(arr[i]);
        }

        System.out.println("Removed duplicates array: " + set);

        // Optional: Close the scanner
        scn.close();
    }

    public static void main(String[] args) {
        questions();
    }
}
