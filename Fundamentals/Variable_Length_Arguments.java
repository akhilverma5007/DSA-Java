package Fundamentals;
import java.util.Arrays;
public class Variable_Length_Arguments {
    public static void main(String[] args) {
        // When we dont know how many inputs we are giving
        fun(10,20,30);
        namesStr("Akhil","Verma","One");
        multiple(10, 20, "Akih","akkak");
    }

    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void namesStr (String ...a){
        System.out.println(Arrays.toString(a));
    }

    static void multiple (int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
