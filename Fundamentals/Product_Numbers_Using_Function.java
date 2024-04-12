// Define a method that returns the product of two numbers entered by user.
package Fundamentals;

import java.util.Scanner;

public class Product_Numbers_Using_Function {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers to find their product: ");
    System.out.print("Enter Number 1: ");
    int num1 = in.nextInt();
    System.out.print("Enter Number 2: ");
    int num2 = in.nextInt();
    int ans = product(num1, num2);
    System.out.println(ans);
}    
static int product(int num1, int num2){
    return num1*num2;
}
}
