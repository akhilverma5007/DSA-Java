// Take name as input and print a greeting message for that particular name.
package Fundamentals;

import java.util.Scanner;

public class Greeting_Message {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hi " + name + "! Welcome to codebase. Thanks!");
    }    
}
