package DSA.Searching;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        // Searching : Process of finding a given value position in a list of values.
        // Linear/Sequential Search
        // Q: Find whether 14 exists in array or not.
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[] arr = {18,12,9,14,77,50};
        int index_found = linearSearch(arr, target);
        System.out.println("Index is : " + index_found);
        int element_found = linearSearch2(arr, target);
        System.out.println("Element is : " + element_found);
    }

    static int linearSearch(int[] arr, int target){
        // target = in.nextInt();
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
        // return Integer.MAX_VALUE;
        
    }

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
