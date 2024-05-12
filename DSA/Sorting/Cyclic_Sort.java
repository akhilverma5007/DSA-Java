package DSA.Sorting;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args){
        int[] arr = {2,3,4,1,5};
        
        // Arrays.sort(arr);
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    

    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}