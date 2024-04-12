// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package Fundamentals;

import java.util.Scanner;

public class Maximum_Minimum_Number{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers to find out Maximum and Minimum? ");
        System.out.print("Enter Number1 : ");
        int first = in.nextInt();
        System.out.print("Enter Number2 : ");
        int second = in.nextInt();
        System.out.print("Enter Number3 : ");
        int third = in.nextInt();
        int max = max_Number(first, second, third);
        System.out.println(max + " is Largest.");
        int min = min_Number(first, second, third);
        System.out.println(min + " is Smallest.");
    }

    static int max_Number(int first, int second, int third){
        int max = first;
        if(second > max){
            max = second;
        }if(third > max){
            max = third;
        }
        return max;
    }

    static int min_Number(int first, int second, int third){
        int min = first;
        if(second < min){
            min = second;
        }if(third < min){
            min = third;
        }
        return min;
    }
}