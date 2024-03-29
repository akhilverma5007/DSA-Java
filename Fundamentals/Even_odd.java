// Write a program to print whether a number is even or odd, also take input from the user.
package Fundamentals;

import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether its Even or Odd! ");
        int num = in.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is Even.");
        }else{
            System.out.println("Number is Odd.");
        }
        
    }
}
