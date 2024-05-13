package Fundamentals;

public class Patterns_Using_Java {
    public static void main(String[] args) {
        pattern1(5);
    }

    static void pattern1(int n){
        for (int row = 0; row < n; row++) {
        //    System.out.println("*");
           for(int col = 1; col <= row; col++){
            System.out.print("* ");
           }
           System.out.println();
        }
    }
}
