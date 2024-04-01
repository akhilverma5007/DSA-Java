package Fundamentals;

import java.util.Scanner;

public class Conditionals_Loops_SwitchStatements {
    public static void main(String[] args) {

        // Java folllows Unicode
        System.out.println("Unicode Explanation");
        int number = 'a';
        System.out.println(number);
        System.out.println("नमस्ते");

        // If Condition
        System.out.println("Conditionals Explanation> IF Condition");
        int a = 10;
        if(a == 10){
            System.out.println("True.");
        }else{
            System.out.println("False.");
        }

        // Multiple If Else Condition
        int salary = 12000;
        if(salary >= 10000){
            salary += 2000;
        }else if(salary < 10000){
            salary += 1000;
        }else{
            salary += 0;
        }
        System.out.println(salary);


        // Loops 
        // Ques print numbers using loop
        for (int i = 1; i <= 5; i+=1) {
            System.out.println(i);
        } 

        // print numbers 1 to n
        Scanner in = new Scanner(System.in);
        

        // While Loop (When you dont know how many times the loop is going to run)
        System.out.println("Loops Explanation> While Loop");
        int count = 1;
        while(count<=10){
            System.out.println("count>>" + count);
            count++;
        }

        // For Loop (When you know how many times will the loop run)
        System.out.println("fLoops Explanation> For Loop");
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // Do While Loop (Atleast one time Loop will run)
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);


        // DIfference between if if AND if else if
        int anum = 1;
        int bnum = 1;
        if(anum == bnum){ // if condition one is true, it will still keep checking rest of conditions
            System.out.println("success");
        }if(anum == bnum){
            System.out.println("success 2");
        }


        if(anum == bnum){  // where condition met true it will not further check rest conditions
            System.out.println("success");
        }else if(anum == bnum){
            System.out.println("success 2");
        }
    }
}
