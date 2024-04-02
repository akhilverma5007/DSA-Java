// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
package Fundamentals;

import java.util.Scanner;

public class Input_Number_Till_0_Entered {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Enter numbers (enter 0 to stop)");
        num = in.nextInt();
        while(num != 0){
            sum += num;
            num = in.nextInt();
        }
        
        System.out.println(sum);

    }
}
