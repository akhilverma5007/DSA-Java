package DSA.Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        insertionSort(arr);
            System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i <  arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] newArr, int first, int second){
        int temp = newArr[first];
        newArr[first] = newArr[second];
        newArr[second] = temp;
    }
}
