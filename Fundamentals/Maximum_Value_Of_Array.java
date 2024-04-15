package Fundamentals;

public class Maximum_Value_Of_Array {
    public static void main(String[] args) {
        int[] arr = {10,20,34,51,22,44};
        System.out.println(max(arr));
        System.out.println(max(arr, 0,3));
    }

    static int max(int[] arr){
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxIndex){
                maxIndex = arr[i];
            }
        }
        return maxIndex;
    }

    static int max(int[] arr, int start, int end){
        int maxNumber = 0;
        for (int i = start; i <= end; i++) {
            // if(end>start){
            //     return -1;
            // }
            // if(arr == null){
            //     return -1;
            // }
            if(arr.length == 0){
                return -1;
            }
            if(arr[i] > maxNumber){
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
}
