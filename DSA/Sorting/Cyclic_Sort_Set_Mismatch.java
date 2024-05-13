package DSA.Sorting;

public class Cyclic_Sort_Set_Mismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4}; // Example input array
        int[] result = findErrorNums(nums);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }

    static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        // Cyclic sort to identify the duplicate and mark numbers
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            // Check if the number at nums[i] is already in its correct position
            if (nums[i] != nums[correctIndex]) {
                // Swap nums[i] with nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Find the duplicate and missing numbers
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result[0] = nums[j]; // Found the duplicate
                result[1] = j + 1;   // Missing number is j + 1
                break;
            }
        }

        return result;
    }
}

