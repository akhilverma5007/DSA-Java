package DSA.Searching;

public class Binary_Search_In_Sorted_2DArrays {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int target = 2;
        searchInSortedMatrix(matrix, target);
    }

    static void searchInSortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = matrix[mid / cols][mid % cols]; // Calculating the position in 2D

            if (midValue == target) {
                System.out.println("Target " + target + " found at index (" + (mid / cols) + ", " + (mid % cols) + ")");
                return;
            } else if (midValue < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Target " + target + " not found in the matrix.");
    }
}
