import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMedium {

    private static void que20() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9};
        int[] mergedArr = new int[arr1.length + arr2.length];
        // Copy elements of arr1 into mergedArray
        for (int i = 0; i < arr1.length; i++) {
            mergedArr[i] = arr1[i];
        }

        // Copy elements of arr2 into mergedArray
        for (int i = 0; i < arr2.length; i++) {
            mergedArr[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(mergedArr));

        // Create ArrayLists from the arrays
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements from both arrays
        for (int num : arr1) {
            list.add(num);
        }
        for (int num : arr2) {
            list.add(num);
        }

        // Convert the ArrayList back to an array
        Integer[] mergedArray = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(mergedArray));
    }


    public static void main(String[] args) {
        que20();
    }
}
