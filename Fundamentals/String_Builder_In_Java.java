package Fundamentals;

import java.util.Arrays;

public class String_Builder_In_Java {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        System.out.println(builder.reverse());
        
        String name = "akhil";
        StringBuilder builder2 = new StringBuilder(name);
        builder2.reverse();
        System.out.println(builder2);
        // System.out.println(builder2.toString());
        

        // String Methods
        String name2 = "Akhil Verma Hello";
        System.out.println(Arrays.toString(name2.toCharArray()));
        System.out.println(name2.toLowerCase()); // Original one will not change becuase of immutability
        System.out.println(name2.indexOf('h'));
        System.out.println("   aaaa".strip());
        System.out.println(Arrays.toString(name2.split(" ")));
    }   
}
