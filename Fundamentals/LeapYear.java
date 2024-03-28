// Input a year and find whether it is a leap year or not.
package Fundamentals;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year to check whether its Leap or not! ");
        int year = in.nextInt();
        // if the year is divisible by 4, it's a leap year, 
        // except for end-of-century years, which must also be divisible by 400
        if (year % 4 == 0 & year % 400 == 0){
            System.out.println("Its a Leap Year.");
        }else{
            System.out.println("Its not a Leap Year.");
        }
    }
}
