// Take 2 numbers as input and print the largest number.
package Fundamentals;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter three numbers to find the largest amungst them: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt(); 

        // int max = num1;
        // if (num2 > max){
        //     max = num2;
        // }if(num3 > max){
        //     max = num3;
        // }    

            // Using Math.max
            int max = Math.max(Math.max(num2, num2), num3);
        System.out.println("max no is " + max );


    }
}
