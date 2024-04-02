// Area Of Circle Java Program
package Fundamentals;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input radius: ");
        double radius = in.nextDouble();
        double pi = Math.PI;
        double aoc = pi * radius * radius;
        System.out.println(aoc);
    }
}