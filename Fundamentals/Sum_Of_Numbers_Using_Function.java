// Write a program to print the sum of two numbers entered by user by defining your own method.
package Fundamentals;

import java.util.Scanner;

public class Sum_Of_Numbers_Using_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int ans = sum(num1, num2);
        System.out.println(ans);
    }
    static int sum(int num1, int num2){
        return num1+num2;
    }
}
