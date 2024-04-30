package DSA.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] newArr = {1, 3, 4, 5, 2};
        selection_Sort(newArr);
        System.out.println(Arrays.toString(newArr));
    }

    static void selection_Sort(int[] newArr){
        for(int i = 0; i < newArr.length; i++){
            // find the max item in the remaining array and swap with correct index
            int last = newArr.length - i - 1;
            int maxIndex = getMaxIndex(newArr, 0, last);
            swap(newArr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] newArr, int start, int end){
        int max = start;

        for (int i = start; i <= end; i++) {
            if(newArr[max] < newArr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] newArr, int first, int second){
        int temp = newArr[first];
        newArr[first] = newArr[second];
        newArr[second] = temp;
    }
}
