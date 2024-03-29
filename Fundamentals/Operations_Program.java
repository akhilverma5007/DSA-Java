// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Fundamentals;

import java.util.Scanner;

public class Operations_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Two numbers to perform an operation.");
        System.out.print("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = in.nextInt();
        System.out.print("Enter a Operator to perform a operation between above entered numbers: Eg; + - * / ");
        char ch = in.next().charAt(0);
        int sol = 0;
        if (ch == '+'){
            sol = num1 + num2;
            System.out.println(sol);
        } else if (ch == '-'){
            sol = num1 - num2;
            System.out.println(sol);
        } else if (ch == '*'){
            sol = num1 * num2;
            System.out.println(sol);
        } else if (ch == '/'){
            sol = num1 / num2;
            System.out.println(sol);
        }else{
            System.out.println("Invalid Operator");
        }
    }    
}
