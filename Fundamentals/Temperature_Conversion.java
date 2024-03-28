package Fundamentals;
import java.util.Scanner;
public class Temperature_Conversion {
    public static void main(String[] args) {
        System.out.println("please enter temperature in Celcius! ");
        Scanner in = new Scanner(System.in);
        float celciusTemp = in.nextInt();
        float conversion = (celciusTemp * 9/5) + 32;
        //(0°C × 9/5) + 32 = 32°F
        System.out.println("Conversion of Celcius into Fahrenheit is : " + conversion);
    }
}
