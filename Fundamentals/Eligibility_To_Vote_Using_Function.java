// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package Fundamentals;

import java.util.Scanner;

public class Eligibility_To_Vote_Using_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        vote(age);
    }
    static void vote(int age){
        if(age >= 18){
            System.out.println("You're Eligible to vote. ");
        }else{
            System.out.println("Sorry You're Not Eligible.");
        }
    }
}
