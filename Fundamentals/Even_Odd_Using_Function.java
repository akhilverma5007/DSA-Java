// Define a program to find out whether a given number is even or odd.
package Fundamentals;

import java.util.Scanner;

public class Even_Odd_Using_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number to check whether its odd or even. ");
        int num = in.nextInt();
        even_Odd(num);
    }

    static void even_Odd(int num){
        if(num % 2 == 0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
}
