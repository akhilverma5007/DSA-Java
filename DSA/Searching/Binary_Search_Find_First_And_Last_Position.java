package DSA.Searching;

public class Binary_Search_Find_First_And_Last_Position {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
        int[] result = toFindFirstAndLast(nums, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

    static int[] toFindFirstAndLast(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true); // Find first occurrence
        ans[1] = search(nums, target, false); // Find last occurrence
        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // Found target, update potential answer
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1; // Look for first occurrence
                } else {
                    start = mid + 1; // Look for last occurrence
                }
            }
        }
        
        return ans;
    } 
}
