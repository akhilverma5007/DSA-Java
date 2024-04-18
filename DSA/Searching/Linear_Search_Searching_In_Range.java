package DSA.Searching;

public class Linear_Search_Searching_In_Range {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int start = 0;
        int end = 4;
        int target = 30;

        int result = searchInRange(arr, start, end, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the specified range.");
        }
    }
    static int searchInRange(int[] arr, int start, int end, int target) {
        if (arr.length == 0 || start < 0 || end >= arr.length || start > end) {
            return -1; // Invalid range or empty array
        }

       
        for (int i = start; i <= end; i++) { // Iterate over the specified range [start, end]
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        
        return -1; // Return -1 if target is not found in the specified range
    }
}