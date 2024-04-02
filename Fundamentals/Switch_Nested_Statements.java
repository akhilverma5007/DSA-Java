package Fundamentals;

import java.util.Scanner;

public class Switch_Nested_Statements {
    public static void main(String[] args) {

        // String
        // String a = "Akhil";
        // String b = "Akhil";
        // System.out.println("If a == b : " + a == b); // False
        // System.out.println("If a.equals(b) : " + a.equals(b)); // True

        Scanner in = new Scanner(System.in);
        System.out.println("Enter fruit name: ");
        String fruitName = in.next();
        switch(fruitName){
            case "apple":
            System.out.print("Its an Apple.");
            break;
            case "orange":
            System.out.print("Its an Orange.");
            break;
            case "grapes":
            System.out.print("Its an Grapes.");
            break;
            case "banana":
            System.out.print("Its an Banana.");
            break;

            default:
            System.out.println("Invalid Input");
        }

        //Enhanced Switch
        System.out.println();
        System.out.println("Enter day no to find day: ");
        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
