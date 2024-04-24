package DSA.Searching;

public class Binary_Search_Infinite_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 10, 23, 24, 46, 57, 68, 79, 80, 90, 100, 233, 434, 545, 567, 788, 888, 999};
        int target = 100;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // Find the range where target might lie
        int start = 0;
        int end = 1;

        // Expand the range until target is within arr[end]
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2; // Double the size of the box
            start = newStart;
        }

        // Perform binary search within the identified range [start, end]
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid; // Found target
                break;
            }
        }

        return ans;
    }
}
