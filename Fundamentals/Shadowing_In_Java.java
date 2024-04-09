package Fundamentals;

public class Shadowing_In_Java {
    static int x = 90; // This will be available to everyone in this class(block)  -> This will be shadowed 
    // static here means object independent
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40;  // Lower level will override the upper level 
        System.out.println(x); // 40
        fun();

        //Shadowing means overlaping the scope
    }

    static void fun(){
        System.out.println(x); // 90
    }
}
