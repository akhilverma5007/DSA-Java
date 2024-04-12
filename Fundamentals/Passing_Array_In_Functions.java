package Fundamentals;
import java.util.Arrays;

public class Passing_Array_In_Functions {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] arr){
        arr[0] = 200;
        arr[1] = 300;
    }
}
