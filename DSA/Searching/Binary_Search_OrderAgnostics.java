package DSA.Searching;

public class Binary_Search_OrderAgnostics {
    public static void main(String[] args) {
        int[] descendingArr = {90,75,70,50,40,22,4,1};
        int target = 22;
        System.out.println(binarySearch_ForDecending(descendingArr, target));

    }

    static int binarySearch_ForDecending(int[] descendingArr, int target){
        int start = 0;
        int end = descendingArr.length - 1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (descendingArr[mid] == target) {
                return mid;
            } else if (descendingArr[mid] < target) {
                end = mid - 1;  // Since array is in descending order, move left in the array
            } else {
                start = mid + 1;  // Since array is in descending order, move right in the array
            }
        }
    
        return -1;  // Target not found
    }
    
}
