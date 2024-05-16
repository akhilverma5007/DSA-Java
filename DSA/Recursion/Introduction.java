package DSA.Recursion;

public class Introduction{
    public static void main(String[] args){
        // messagePrinting();
        message();
    }

    // static void messagePrinting(){
    //     for(int i = 0; i < 5; i++){
    //         message();
    //     }
    // }

    static void message(){
        System.out.println("Hello World!");
        message1();
    }
    static void message1(){
        System.out.println("Hello World!");
        message2();
    }
    static void message2(){
        System.out.println("Hello World!");
        message3();
    }
    static void message3(){
        System.out.println("Hello World!");
        message4();
    }
    static void message4(){
        System.out.println("Hello World!");
    }
    
}