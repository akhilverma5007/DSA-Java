package DSA.Searching;

public class Linear_Search_Finding_Minimum_Number {
    public static void main(String[] args) {
        int[] arr = {12,32,45,67,88};
        int start = 1;
        int end = 4;
        System.out.println(minNumber(arr));
        System.out.println(minNumber(arr, start, end));
    }

    static int minNumber(int[] arr){
        int minimum_num = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minimum_num){
                minimum_num = arr[i];
            }
        }
        return minimum_num;
    }

    static int minNumber(int[] arr, int start, int end){
        if (arr == null || start < 0 || end > arr.length || start >= end) {
            throw new IllegalArgumentException("Invalid range or array");

        }
        int minimum_num = arr[start];

        for (int i = start; i < end; i++) {
            if(arr[i] < minimum_num){
                minimum_num = arr[i];
            }
        }
        return minimum_num;
    }
}
