package DSA.Searching;

public class Binary_Search_Find_First_And_Last_Postiton {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
        
        int[] result = findFirstAndLastPosition(nums, target);
        
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

    static int[] findFirstAndLastPosition(int[] nums, int target) {
        int[] result = {-1, -1};
        
        // Find first occurrence
        result[0] = binarySearch(nums, target, true);
        if (result[0] == -1) {
            return result; // Early return if target not found
        }
        
        // Find last occurrence
        result[1] = binarySearch(nums, target, false);
        
        return result;
    }

    static int binarySearch(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else { // Found target, update result and continue binary search
                result = mid;
                if (isFirst) {
                    end = mid - 1; // Look for first occurrence
                } else {
                    start = mid + 1; // Look for last occurrence
                }
            }
        }
        
        return result;
    }
}
