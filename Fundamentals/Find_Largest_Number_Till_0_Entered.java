// Take integer inputs till the user enters 0 and print the largest number from all.
package Fundamentals;

import java.util.Scanner;

public class Find_Largest_Number_Till_0_Entered {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int largest = 0; // Initialize largest outside the loop

        System.out.println("Enter numbers (enter 0 to stop): ");
        num = in.nextInt();
        while (num != 0) {
            if (num > largest) {
                largest = num; // Update largest if num is greater
            }
            num = in.nextInt();
        }

        System.out.println("Largest number: " + largest); // Print largest after the loop

        in.close();
    }
}

