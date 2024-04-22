package DSA.Searching;
public class Binary_Search_Ceiling_Of_A_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        // Ceiling of number = smallest number >= target number
        // System.out.println(ceilingNumber(arr, target));
        System.out.println(ceilingNumberUsing_BinarySearch(arr, target));
    }

   

    // 2nd Logic Using Binary
    static int ceilingNumberUsing_BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target == arr[mid]){
                return arr[mid];
            }else if(arr[mid] < target){
                start = mid + 1;
                return arr[start];
            }else{
                end = mid - 1;
                return arr[end];
            }
        }
    return -1;
    }



     // Using Linear Search
    // static int ceilingNumber(int[] arr, int target){
    //     for(int index = 0; index < arr.length; index++){
    //         int element = arr[index];
    //         if(element == target){
    //             return element;
    //         }else if(arr[index] > target){
    //             return arr[index]; 
    //         }
    //     }
    //     return -1;
    // }
}
