package DSA.Sorting;

public class Cyclic_Sort_Find_The_Dublicate_Number {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};

        int duplicateNumber = findDuplicateNumber(arr);
        System.out.println("Duplicate number in the array: " + duplicateNumber);
    }

    static int findDuplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // If arr[i] is not already in its correct position, perform a swap
            if (arr[i] != arr[correctIndex]) {
                // Check if the element at arr[i] is already a duplicate
                if (arr[i] == arr[arr[i] - 1]) {
                    return arr[i]; // Found the duplicate number
                }

                // Swap arr[i] with arr[correctIndex]
                swap(arr, i, correctIndex);
            } else {
                i++; // Move to the next element
            }
        }

        // If no duplicate number is found
        return -1;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
