// Input currency in rupees and output in USD.
package Fundamentals;

import java.util.Scanner;

public class Conversion_Rupees_USD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rupees to convert in USD.");
        float rupees = in.nextFloat();
        float usdConversion = rupees * 0.012f;
        System.out.println("Conversion is : " + usdConversion);
    }
}
