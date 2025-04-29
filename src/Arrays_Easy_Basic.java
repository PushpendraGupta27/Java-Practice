import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Easy_Basic {
    private static final int[] array = {4, 6, 9, 5, 2, 3};

    static Scanner scn = new Scanner(System.in);

    private static void sumAndAvg() {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        // Find the sum of all elements in an array
        System.out.println("Sum of elements: " + sum);
        // Find the average of all elements in an array
        System.out.println("Average of elements: " + (sum / array.length));
    }

    private static void minAndMax() {
        // Find the maximum and minimum elements in an array
        int min = array[0];
        int max = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        // Find the range of an array (difference between max and min)
        System.out.println("difference between max and min: " + (max - min));
    }

    private static void reverse() {
        // Reverse an array
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    private static void searchElement() {
        // Search for an element in an array (linear search)
        System.out.print("Enter an element you want to search: ");
        int num = scn.nextInt();
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num && index == -1) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in array.");
        }
    }

    private static void copyElements() {
        // Copy elements of one array into another array
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        System.out.println("copy array: " + Arrays.toString(newArr));
    }

    private static void checkSorted() {
        // Check if an array is sorted in ascending order
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }
    }

    private static void countEvenAndOdd() {
        // Count the number of even and odd elements in an array
        int oddCount = 0;
        int evenCount = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        System.out.println("Even elements in array is:" + evenCount);
        System.out.println("odd elements in array is:" + oddCount);
    }

    private static void separateEvenAndOdd() {
        // Separate odd and even integers in an array(separates the even and odd numbers into two different arrays)
        int[] oddArray = new int[array.length];
        int[] evenArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[i] = array[i];
            } else {
                oddArray[i] = array[i];
            }
        }
        System.out.println("Even element array is:" + Arrays.toString(evenArray));
        System.out.println("odd element array is:" + Arrays.toString(oddArray));
    }

    public static void main(String[] args) {
        sumAndAvg();
        minAndMax();
        reverse();
        searchElement();
        copyElements();
        checkSorted();
        countEvenAndOdd();
        separateEvenAndOdd();
    }
}