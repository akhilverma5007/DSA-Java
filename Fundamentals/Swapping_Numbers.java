package Fundamentals;

import java.util.Scanner;

public class Swapping_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers to swap: ");    
        System.out.print("Enter number 1: ");  
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");    
        int num2 = in.nextInt();
        System.out.println("Number 1 before Swapping : " + num1);
        System.out.println("Number 2 before Swapping : " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Number 1 after Swapping : " + num1);
        System.out.println("Number 2 after Swapping : " + num2);
    }
    
}
