// Area Of Triangle
package Fundamentals;

import java.util.Scanner;

public class Area_Of_Triangle {
    public static void main(String[] args) {
        // Area of a Triangle = A = ½ (b × h) square units. where b and h are the base and height of the triangle, respectively. 
        Scanner in = new Scanner(System.in);
        System.out.print("Input Base: ");
        double base = in.nextDouble();
        System.out.print("Input Height: ");
        double height = in.nextDouble();

        double aot = 0.5 * (base * height); // Use 0.5 instead of 1/2
        System.out.println(aot);
    }
}
