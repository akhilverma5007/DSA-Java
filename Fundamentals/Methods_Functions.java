package Fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Methods_Functions {
    public static void main(String[] args) { // The first method that runs
    /*
     return_type name () {
        //body
        return statement;
     } 
     */

    // sum(); // calling the function
    System.out.println(sum(10,20)); // Passing values
    System.out.println(name("Akhil"));
    swap(10,20);

    int numb1 = 10;
    int numb2 = 20;
    swap2(numb1, numb2);
    System.out.println(numb1 + " " + numb2);

    String changeName_Name = "Akhil Verma";
    changeName(changeName_Name);
    System.out.println(changeName_Name);

    // String one = "SSSS";
    // System.out.println(one);
    // one = "aaa";
    // System.out.println(one);

    // Primitives : int, short, char, byte....
    // Just pass by value

    // Objects & Stuff.. : passing value of its reference variable
    
    int[] arr = {1,2,34,66};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));

    
    }
    static void sum() { // () passing arguments/parameters
        // pass the value of numbers when you are calling the method in main()
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = in.nextInt();
        System.out.println("Sum is : " + (num1 + num2));
    }

    // Function with return type
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    // Greting Function
    static String name(String nm){
        String output_String = "Thanks! " + nm;
        return output_String;
    }

    static void swap(int numberA, int numberB){ // This will swap
        int temp = numberA;
        numberA = numberB;
        numberB = temp;
        System.out.println(numberA);
        System.out.println(numberB);

    }

    static void swap2(int numberA, int numberB){  // This will not swap
        int temp = numberA;
        numberA = numberB;
        numberB = temp;
    }

    static void changeName (String nameCheck){ // WIll not change
        nameCheck = "AKHIL";
        // not changing, instead its creating a new object
        // String are immutable for security reason, you can't change them
    }

    // In java there is no such thing like Pass By Reference; 
    // There is only Pass By Value;

    static void changeArr(int[] arr){
        arr[0] = 99;
        // If you make a change to the object via this ref variable, original object gets changed.
    }
}
