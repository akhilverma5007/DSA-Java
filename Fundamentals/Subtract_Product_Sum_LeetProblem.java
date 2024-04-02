// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
package Fundamentals;

import java.util.Scanner;

public class Subtract_Product_Sum_LeetProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product = 1;
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n = n/10;
        }
    System.out.println(product-sum);
    }
}
