// ARRAYS ARE NON-PRIMITIVES : becuause they can be broken down further
package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;;
public class Array_In_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        // datatype[] variable_name = new datatype[size];

        int[] rnos = new int[5];
        int[] rnos1; // declaration of array. rnos is getting defined in stack.
        rnos1 = new int[5]; // initialisation: here object is being created in the (memory) heap.
        

        int[] rollnos = {1,2,3,4,5,6};
        String[] names = {"akhil1","akhil2","akhil3","akhil4","akhil5"};
        System.out.println(rollnos[1]);
        System.out.println(Arrays.toString(rollnos));
        System.out.println(names[1]);
        System.out.println(Arrays.toString(names));

        int[] newArr = new int[5];
        System.out.println(Arrays.toString(newArr));
        String[] strArr = new String[5];
        System.out.println(Arrays.toString(strArr));

        // INput in Arrays
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 64;
        System.out.println(Arrays.toString(arr));

        // Input using for loops
        int[] arr2 = new int[5];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = in.nextInt();
        }

        // Output using for loop
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Output uisng for each loop
        for (int each : arr2) {
            System.out.print(each + " ");
        }

        // If you input more thsn the size of array : It will show error: INDEX OUT OF BOUND
        // Arrays.toString : converts array into string

        String[] newStr = new String[10];
        for(int i = 0; i < newStr.length; i++){
            newStr[i] = in.next();
        }

        // for (String each : newStr){
        //     System.out.print(each + " ");
        // }
        System.out.println(Arrays.toString(newStr));
    }
}
