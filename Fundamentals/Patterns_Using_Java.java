package Fundamentals;

public class Patterns_Using_Java {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(3);
    }

    static void pattern1(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n){
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
