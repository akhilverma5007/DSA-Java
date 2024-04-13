package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    // Array of Arrays
    /*
     {
        {1,2,3},
        {4,5,6},
        {7,8,9},
     }
     */

    // int[][] arr = new int[3][];
    int[][] arr = {
        {10,20,30}, //0th index
        {40,50,60}, //1st index
        {70,80,90}, //2nd index
    };
     
    //to specifying no of rows is mandatory : 3
    // System.out.println(Arrays.toString(arr[0]));
    // System.out.println(arr[0][1]);
    
        // Input
        for(int row = 0; row < arr.length; row++){
        
        // Output
        for(int col = 0; col < arr[row].length; col++){
            System.out.print(arr[row][col] + " ");
        }
        System.out.println();
    }

    int[][] arr2D = new int[3][3];
        // Input
        for(int row = 0; row < arr2D.length; row++){
            // for every coloumn
            for(int col = 0; col < arr2D[row].length; col++){
                arr2D[row][col] = in.nextInt();
            }
        }

        // Output
        for(int row = 0; row < arr2D.length; row++){
            // for every column
            for(int col = 0; col < arr2D[row].length; col++){
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }

        // Using Arrays.toString for output
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        // Using Enhanced forloop for Output
        for(int[] each : arr2D){
            System.out.println(Arrays.toString(each));
        }
    } 
}
