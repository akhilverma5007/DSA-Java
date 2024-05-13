package DSA.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Cyclic_Sort_Find_All_Numbers_Disappered_In_Array {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
        System.out.println("Numbers disappeared in the array: " + disappearedNumbers);
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> disappearedNumbers = new ArrayList<>();

        // Perform cyclic sort to place each element in its correct position
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // Ensure arr[i] is within the valid range and not already in its correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Identify numbers that are missing from the sequence [1, arr.length]
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                disappearedNumbers.add(index + 1);
            }
        }

        return disappearedNumbers;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
