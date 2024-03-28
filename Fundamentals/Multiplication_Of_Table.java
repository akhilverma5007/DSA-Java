// Take a number as input and print the multiplication table for it.
package Fundamentals;
import java.util.Scanner;

public class Multiplication_Of_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.println(i*number);
        }
    }    
}
