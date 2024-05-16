package DSA.Recursion;

public class NumbersExample {
    public static void main(String[] args){
        // write a function that takes in a number and prints it
        // print first 5 numbers: 1 2 3 4 5
        // print1(1);
        print(1);

    }

    // static void print1(int n){
    //     System.out.println(n);
    //     print2(2);
    // }

    // static void print2(int n){
    //     System.out.println(n);
    //     print3(3);
    // }

    // static void print3(int n){
    //     System.out.println(n);
    //     print4(4);
    // }

    // static void print4(int n){
    //     System.out.println(n);
    //     print5(5);
    // }

    // static void print5(int n){
    //     System.out.println(n);
    // }

    // Recursion is function calling function 
    static void print(int n){
        if(n == 5){  // base condition
            // in case of no base condition -> function call will keep happening, stack will be filled
            // again and again. Memory of computer will exceed the limit -> StackOverflow Error
            System.out.println(5);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling function again and again, you can treat it as a seperate call in the stack.
        print(n + 1);
        
    }

} 
