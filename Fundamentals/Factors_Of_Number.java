// Input a number and print all the factors of that number (use loops).
package Fundamentals;

import java.util.Scanner;

public class Factors_Of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        System.out.print("Factors of " + number + ": ");
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
        in.close();
    }
}
