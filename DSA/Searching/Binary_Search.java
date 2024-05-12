package DSA.Searching;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary_Search {

    // Q: When should we apply Binary Search?
    // Whenever you get a sorted array try applying binary search, 90% of the time you will get the answer
    
    public static void main(String[] args) {
        int[] arr = {4,8,12,16,19,70,95};
        int target = 70;
        // int[] arr = {4,78,2,6,9,1,5};

        // Arrays.sort(arr);
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        System.out.println(binarySearch(arr, target));
    }

    // Binary search implementation to find the target in the sorted array
    // Returns the index of the target if found, otherwise returns -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Calculate mid to avoid potential overflow issue
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;  // Found the target, return the index
            } else if (target < arr[mid]) {
                end = mid - 1;  // Target is in the left half
            } else {
                start = mid + 1;  // Target is in the right half
            }
        }

        return -1;  // Target not found
    }
}
