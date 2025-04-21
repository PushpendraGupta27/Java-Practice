public class Arrays_Easy2Medium {
    private static final int[] arr = {1, -2, 2, 0, -3, 4, -4, 5};

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
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        int secMax = Integer.MIN_VALUE;
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
    }

    public static void main(String[] args) {
        que13And14();
        que15();
        que16();
    }
}
