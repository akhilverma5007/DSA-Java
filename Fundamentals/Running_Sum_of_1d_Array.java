// Sum of 1d Array
package Fundamentals;

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,32,42,23};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            

            if(arr.length!= 0){
                sum = sum + arr[i];
            }

        }
        System.out.println(sum);
    }
}
