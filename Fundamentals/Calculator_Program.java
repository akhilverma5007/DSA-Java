package Fundamentals;

import java.util.Scanner;

public class Calculator_Program {
    public static void main(String[] args) {
        // Keep taking input till user does not press 'x' or 'X'
        Scanner in = new Scanner(System.in);
        int res = 0;
        
        while (true){
            System.out.print("Enter an Opearor : ");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '%'){
                System.out.print("Enter Number 1: ");
                int num1 = in.nextInt();
                System.out.print("Enter Number 2: ");
                int num2 = in.nextInt();
                if(op == '+'){
                    res = num1 + num2;
                }if(op == '-'){
                    res = num1 - num2;
                }if(op == '*'){
                    res = num1 * num2;
                }if(op == '/'){
                    if(num2 !=0){
                    res = num1 / num2;
                    }
                }if(op == '%'){
                    res = num1 % num2;
                }  
            }else if (op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid Operation.");
            }
        System.out.println(res);

        }
    }
}
