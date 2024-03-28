// Take two numbers and print the sum of both.
package Fundamentals;

import java.util.Scanner;

public class Sum_Calculation {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum Calculation of two Numbers is: " + sum);
        System.out.println();

        // Using User Input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Numbers to calculate their sum! ");
        System.out.print("Enter Number 1: ");
        int numb1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int numb2 = in.nextInt();
        int sumCalc = numb1+numb2;
        System.out.println("Sum of " + numb1 + " + " + numb2 + " is " + sumCalc);
    }
}
