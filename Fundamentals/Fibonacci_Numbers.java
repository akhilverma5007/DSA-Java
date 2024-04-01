package Fundamentals;

import java.util.Scanner;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        // By adding previous two numbers
        // 0, 1,
        // 0, 1 = 1
        // 1, 1 = 2
        // 1, 2 = 3
        // 2, 3 = 5
        // 0,1,1,2,3,5,8,13.....

        // Ques : Find the nth Fibonacci Number
        // a = 0;
        // b = 1;
        // n = 7 == 13

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
        while(count <= n){
            int temp = i;
            i += p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}

