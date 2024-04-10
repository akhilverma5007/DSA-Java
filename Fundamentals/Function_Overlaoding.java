package Fundamentals;
import java.util.Arrays;
public class Function_Overlaoding {
    public static void main(String[] args) {
        // Happens when two or more functions have same name but with different arguments 
        // Checks at the time of Compile time
        fun();
        fun(20);
        fun(30,40);
        fun("Akhil Verma");
        fun("aaa","bbb","ccc");
    }

    static void fun(){
        System.out.println("Function with No Arguments");
    }

    static void fun(int a){
        System.out.println("Function with A Single Integer Argument: " + a);
    }
    
    static void fun(int a, int b){
        System.out.println("Function with A Two Integer Arguments: " + a + " " + b);
    }
    
    static void fun(String str){
        System.out.println("Function with A Single String Argument: " + str);
    }

    static void fun(String ...f){
        System.out.println(Arrays.toString(f));
    }
}
