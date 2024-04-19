package DSA.Searching;
import java.util.Arrays;
public class Linear_Search_Search_In_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {20,32,43,22},
            {33,23},
            {98,50,21}
        };
        int target = 21;
        int[] ans = searchingTwoD(arr, target); // format of return value {row,col};
        System.out.println(Arrays.toString(ans));

        int maxFindout = searchingMaxInTwoD(arr); // format of return value {row,col};
        System.out.println(maxFindout);
    }

    static int[] searchingTwoD(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    // System.out.println();
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    
    static int searchingMaxInTwoD(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                
                    // int max = arr[0][0];

                    if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // Using Enhanced For Loop
    // static int maxUsingEnForLoop(int[][] arr){
    //     int max = Integer.MIN_VALUE;
    //     for(int[] each : arr){
    //         for(int element : each){
    //             if(element > max){
    //             max = element;
    //             }
    //         }
    //     }
    //     }

}
