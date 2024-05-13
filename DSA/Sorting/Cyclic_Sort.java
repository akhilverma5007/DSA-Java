package DSA.Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5};

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Calculate the correct index (0-based)

            // Ensure correctIndex is within the bounds of the array
            if (correctIndex >= 0 && correctIndex < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++; // Move to the next element
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
