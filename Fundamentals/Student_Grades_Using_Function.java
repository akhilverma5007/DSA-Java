/*
Write a program that will ask the user to enter his/her marks (out of 100). 
Define a method that will display grades according to the marks entered as below:

Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/
package Fundamentals;

import java.util.Scanner;

public class Student_Grades_Using_Function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter maks of 5 subjects: ");
        System.out.print("Enter marks Subject1 : ");
        float subject1 = in.nextFloat();
        System.out.print("Enter marks Subject2 : ");
        float subject2 = in.nextFloat();
        System.out.print("Enter marks Subject3 : ");
        float subject3 = in.nextFloat();
        System.out.print("Enter marks Subject4 : ");
        float subject4 = in.nextFloat();
        System.out.print("Enter marks Subject5 : ");
        float subject5 = in.nextFloat();
        grades(subject1, subject2, subject3, subject4, subject5);
    }

    static void grades(float subject1, float subject2, float subject3, float subject4, float subject5){
        float sum_of_grades = subject1 + subject2  + subject3 + subject4 + subject5;
        float total_marks = 500;
        float percentage = (sum_of_grades / total_marks) * 100;
        int percentage_number = (int)percentage;
        if(percentage_number >= 91 && percentage_number <= 100){
            System.out.println("AA");
        }if(percentage_number >= 81 && percentage_number <= 90){
            System.out.println("AB");
        }if(percentage_number >= 71 && percentage_number <= 80){
            System.out.println("BB");
        }if(percentage_number >= 61 && percentage_number <= 70){
            System.out.println("BC");
        }if(percentage_number >= 51 && percentage_number <= 60){
            System.out.println("CD");
        }if(percentage_number >= 41 && percentage_number <= 50){
            System.out.println("DD");
        }if(percentage_number >= 0 && percentage_number <= 40){
            System.out.println("Fail");
        }
    }
}
