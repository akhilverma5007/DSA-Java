package DSA.Sorting;

public class Cyclic_Sort_MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            // Ensure arr[i] is within the valid range and not already in its correct position
            if (arr[i] >= 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        // Search for the missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index; // Return the missing number
            }
        }

        // If no missing number found in the range [0, arr.length), return arr.length
        return arr.length;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
