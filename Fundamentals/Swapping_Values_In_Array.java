package Fundamentals;

import java.util.Arrays;

public class Swapping_Values_In_Array{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        swap(arr, 0, 1);  
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index0, int index1){
        int temp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = temp;
        
    }
}