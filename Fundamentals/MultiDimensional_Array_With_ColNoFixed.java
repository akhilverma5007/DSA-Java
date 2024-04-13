package Fundamentals;

import java.util.Arrays;

public class MultiDimensional_Array_With_ColNoFixed {
    public static void main(String[] args) {
        // Dynamic Arrays
        int[][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        // for (int[] each : arr) {
        //     System.out.println(Arrays.toString(each));
        // }
    }
}
