package DSA.Searching;

public class Binary_Search_Floor_Of_A_Number{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floorOfNumberUsing_BinarySearch(arr, target));
    }

    // greatest numer smaller or = traget number
    static int floorOfNumberUsing_BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
}