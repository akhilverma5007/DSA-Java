package DSA.Searching;

public class Binary_Search_In_2DArrays {
    public static void main(String[] args) {
        // 2D Arrays / Matrices
        int[][] nums = {
            {10, 20, 30, 40},
            {11, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };
        int target = 37;
        int[] result = toSearchInTwoDArray(nums, target);  // Call the search method
        if (result[0] != -1) {
            System.out.println("Target found at row " + result[0] + " and column " + result[1]);
        } else {
            System.out.println("Target not found in the 2D array.");
        }
    }

    static int[] toSearchInTwoDArray(int[][] nums, int target) {
        // Perform binary search in each row of the 2D array
        for (int row = 0; row < nums.length; row++) {
            int start = 0;
            int end = nums[row].length - 1;

            // Perform binary search within the current row
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[row][mid] == target) {
                    // Target found, return the row and column indices
                    return new int[]{row, mid};
                } else if (nums[row][mid] < target) {
                    start = mid + 1;  // Target is in the right half
                } else {
                    end = mid - 1;  // Target is in the left half
                }
            }
        }

        // Target not found in the 2D array, return {-1, -1}
        return new int[]{-1, -1};
    }
}
