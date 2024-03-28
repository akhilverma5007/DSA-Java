package Fundamentals;

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
    }
}
