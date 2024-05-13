package DSA.Sorting;

public class Cyclic_Sort_First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1}; // Example input array
        int missing = firstMissingPositive(nums);
        System.out.println("First missing positive integer: " + missing);
    }

    static int firstMissingPositive(int[] nums) {
        // Perform cyclic sort to place each positive integer in its correct position
        int i = 0;
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                i++;
            }
        }

        // Find the first missing positive integer
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        // If all positive integers from 1 to nums.length are present, return nums.length + 1
        return nums.length + 1;
    }
}

