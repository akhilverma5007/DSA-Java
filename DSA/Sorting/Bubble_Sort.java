package DSA.Sorting;
import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] newArr = {1, 3, 4, 5, 2};
        bubbleSort(newArr);
        System.out.println(Arrays.toString(newArr));
    }

    static void bubbleSort(int[] newArr) {
        int n = newArr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop to perform comparisons and swap
            for (int j = 0; j < n - i - 1; j++) {
                if (newArr[j] > newArr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swap happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
