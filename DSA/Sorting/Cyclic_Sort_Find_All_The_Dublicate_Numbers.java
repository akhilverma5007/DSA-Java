package DSA.Sorting;

import java.util.ArrayList;
import java.util.List;
public class Cyclic_Sort_Find_All_The_Dublicate_Numbers {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findAllDuplicates(arr);
        System.out.println("Duplicates in the array: " + duplicates);
    }

    static List<Integer> findAllDuplicates(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();

        // Cyclic sort with marking duplicates
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            // Check if the number at arr[i] is already in its correct position
            if (arr[i] != arr[correctIndex]) {
                // Swap arr[i] with arr[correctIndex]
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Identify duplicates by checking out-of-place numbers
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                duplicates.add(arr[j]);
            }
        }

        return duplicates;
    }
}
