package DSA.Searching;

public class Revising_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,6,7,24,56,76};
        int target = 56;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){ // means array lies on left hand side
                end = mid - 1;
            }else if(target > arr[mid]){ // means array lies on right hand side 
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
