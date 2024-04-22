package DSA.Searching;

public class Binary_Search_Floor_Of_A_Number{
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floorOfNumberUsing_BinarySearch(arr, target));
    }

    static int floorOfNumberUsing_BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            System.out.println(mid);
            if(target == arr[mid]){
                return arr[mid];
            }else if(target < arr[mid]){
                end = mid - 1;
                return arr[mid];
            }else{
                start = mid + 1;
                return arr[mid];
            }
        }
    return -1;
    }
}