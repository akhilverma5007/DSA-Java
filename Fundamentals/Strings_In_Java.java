package Fundamentals;

import java.util.Arrays;

public class Strings_In_Java {
    public static void main(String[] args) {
        String name = "Akhil Verma";
        System.out.println(name);

        // Here a and b is pointing to the same Object 
        String a = "akhil";
        String b = "akhil";
        System.out.println(a == b); //true
        System.out.println(a.equals(b)); //true

        // Creating these values outside the pool but in the heap
        String one = new String("output");
        String two = new String("output");

        // comparitor ==
        System.out.println(one == two); //false
        // method a.equals(b)
        System.out.println(one.equals(two)); //true
        System.out.println(one.charAt(0)); //character at Index 0

        // Method OverRiding
        System.out.println(56);

        // Wrapper Class
        Integer num = new Integer(56);
        System.out.println(num.toString());

        // Now OverRiding it with Arrays.toString() Method
        // System.out.println(Arrays.toString());

        // Preety Printing (Formatting of String)
        float fb = 453.262334f;
        System.out.printf("Formatted number is %.2f", fb);
        System.out.println();
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();
        System.out.printf("Hello my name is %s and i am %s", "akhil", "cool");
        System.out.println();
        
        // String Performance
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series += ch;
        }
        System.out.print(series);
    }
}
