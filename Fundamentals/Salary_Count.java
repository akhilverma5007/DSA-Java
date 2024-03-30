package Fundamentals;

import java.util.Scanner;

public class Salary_Count {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int salary = in.nextInt();
    if(salary >= 10000){
        salary += 2000;
    }else{
        salary += 0;
    }
    System.out.println(salary);
}
}
