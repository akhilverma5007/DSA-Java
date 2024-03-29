// Take 2 numbers as input and print the largest number.
package Fundamentals;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to find the largest amungst them!");
        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = in.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is Greatest.");
        }else if (num2>num1){
            System.out.println(num2 + " is Greatest.");
        }else{
            System.out.println("Both are equal.");
        }
    }
}
