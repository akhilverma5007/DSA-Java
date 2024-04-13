package Fundamentals;
import java.util.ArrayList;
import java.util.Scanner;;
public class ArrayList_In_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // When you dont know what size of array you need, and you say java handle the size for (Similar to vectors in c++), is known as ArrayList
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10); 
        // ArrayList<Integer> Here we cannot pass primitives : we have to pass wrapper classes
        list.add(10);
        list.add(20);
        list.add(500);
        list.remove(2);
        System.out.println(list.contains(20));
        System.out.println(list);
        list.set(0, 50);
        System.out.println(list);

        // Input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // Output
        System.out.println(list);

        // Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
