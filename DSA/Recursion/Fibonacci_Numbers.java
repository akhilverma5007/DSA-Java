package DSA.Recursion;

public class Fibonacci_Numbers {
    public static void main(String[] args) {
        // fibonacci_Numbers();
        System.out.println(fibo(7));
    }

    // static void fibonacci_Numbers(){
    //     int n = 7;
    //     int num = n+1;

    //     for(int i = 0; i <= num; i++){
    //         int start = i-1;
    //         int end = i-2;
    //         System.out.println(start + end);

    //     }
    // }

    static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
