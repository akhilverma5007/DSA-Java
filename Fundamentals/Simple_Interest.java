// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package Fundamentals;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal, rate And Interest to Calculate SI: ");
        System.out.print("Enter Principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter Rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter Time: ");
        double time = in.nextDouble();

        double si = principal * time * rate / 100 ;
        System.out.println("Simple interest is : " + si);
    }    
}
