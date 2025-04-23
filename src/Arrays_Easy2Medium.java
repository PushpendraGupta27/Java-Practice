import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arrays_Easy2Medium {
    private static final int[] arr = {1, 2, 2, -3, 4, -4, 5};

    //  Find the sum of negative and positive numbers in an array
    private static void que13And14() {
        int negativeSum = 0;
        int positiveSum = 0;
        for (int element : arr) {
            if (element > 0) {
                positiveSum += element;
            } else {
                negativeSum += element;
            }
        }
        System.out.println("Sum of negative and positive numbers in an array is: " + negativeSum + ", " + positiveSum);
    }

    // Count the number of positive, negative, and zero elements
    private static void que15() {
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;
        for (int element : arr) {
            if (element > 0) {
                positiveCount += 1;
            } else if (element == 0) {
                zeroCount += 1;
            } else {
                negativeCount += 1;
            }
        }
        System.out.println("Count the number of positive, negative, and zero elements: " + positiveCount + ", " + negativeCount + " and " + zeroCount);
    }

    private static void que16() {
        // Find the second-largest element in an array
        // Way-1: Brute Force
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        for (int i : arr) {
            if (i != max && i > secMax) {
                secMax = i;
            }
        }
        if (secMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + secMax);
        }

        // Way-2: Optimize

        for (int j : arr) {
            if (j > max) {
                secMax = max;
                max = j;
            } else if (j != max && j > secMax) {
                secMax = j;
            }
        }

        if (secMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element is: " + secMax);
        }
    }

    private static void que17() {
        // Find the second-smallest element in an array
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (ele < min) {
                secMin = min;
                min = ele;
            } else if (ele != min && ele < secMin) {
                secMin = ele;
            }
        }
        if (secMin == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second smallest element is: " + secMin);
        }
    }

    private static void que18() {
        // Find the product of all elements in an array
        int product = 1;
        for (int i : arr) {
            product = i * product;
        }
        System.out.println("Product of all elements in an array is: " + product);
    }

    private static void que19() {
        // Remove duplicates from an array
        // Way-1
        ArrayList<Integer> unique = new ArrayList<>();
        unique.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                unique.add(arr[i]);
            }
        }
        // Convert the ArrayList back to an array
        Integer[] array = unique.toArray(new Integer[0]);
        System.out.println("After removed duplicates from an array: " + Arrays.toString(array));

        // Way-2
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            set.add(j);
        }
        Integer[] newArr = set.toArray(new Integer[0]);
        System.out.println("After removed duplicates from an array: " + Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        que13And14();
        que15();
        que16();
        que17();
        que18();
        que19();
    }
}
