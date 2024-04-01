package Fundamentals;

// import java.util.Scanner;

public class Counting_Occurences {
    public static void main(String[] args) {
     // n = 1 3 8 5 7 5 7 8 7 9
    // n = 7, ans = 3
    // Scanner in = new Scanner(System.in);
    int n = 12312333;
    int count = 0;
    while(n > 0){
        int rem = n % 10; //last digit
        if(rem == 3){
            count++;
        }
        n = n / 10; 
    }   
    System.out.println(count);
    }
}
