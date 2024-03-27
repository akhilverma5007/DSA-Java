/* 
        Types of Languages:- 
            1. Procedural: series of well structured steps.
            2. Functional: using a bunch of code, without wring it again and again.
                First-class functions: a function can be passed as an argument to other functions, can be returned by another function.
                Eg- a = 10;
                    b = 20;
                    c = b;
            3. Object Oriented: collection of different data; like store data of 10 students: names, marks, rollno etc.
                (Custome Datatype)
                Revolves around objects.
                Class - Named group of properties and functions. (collection of all) Eg. Car
                Object - Instance of a class. Eg. Engine, Stering, Wheels.

        Static Vs Dynamic Languages:-
            Static: Type checking is done at compile time.
                    Errors will show at compile time.
                    Declare datatype before you see it.
                    Eg: int num = 10;
                        String name = "akhil";

                        Eg. int a = 10;
                            String a = "akhil";
                            ERROR IN CASE OF STATIC.

            Dynamic: Type checking is done at runtime.
                    Errors might not show till progran is run.
                    No nee to declare datatype of variables.
                    Eg: num = 10
                        name = "akhil"

                        Eg. a = 10
                            a = "akhil"
                            NO ERROR IN CASE OF DYNAMIC.

        Types of Memory:- a = 10;
            Stack Memory: a(ref variable)
            Heap Memory: 10(object)

        More than one reference variable can point to the same object.
        If any one of the refernce variable changes the object, the original object will be changed for all.
            Eg:         Akhil ->           0
        (REF VARIABLES) Brother ->        <|>  (OBJECT)
                        Son ->             ^

        Object with no reference variables, automatically gets removed from the memory. (When Garbage collection hits)

        Java Architecture:-
        .java code -> byte code                      ->      machine code
                      (platform independent)
                      -Can be run on any platform.

        (JVM is platform dependent.) Inclues in JDK(Java Development Kit)

        Loader: reads .class file and generates binary data.
        Linking: verifies .class file 
    */ 

package Fundamentals;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) { //Main Function in Java
        // If we want to run this function without creating a Instance(Object) of the Main class, we use "static" keyword.
        // void is return type, means returning null here.
        // (String[] args) -> Command Line Argument
        // System.out.println(args[2]); 
        // javac Fundamentals/Main.java (To create Binary code) 
        // javac -d . Main.java (Same Directory)
        // javac -d .. Main.java (One Previous Directory)
        // where javac (To Find Where this command is located)
        // echo $PATH

        // Java Standard-Output-Stream
        System.out.println("Hello World! ");

        // Java Standard-Input-Stream
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);

        // DATATYPES
        // Non Primitiives - (Which we can break further into dattaype)
        String name = "Akhil"; // we can break it into characters

        // Primitives - (Which we cannot break further into dattaype)
        int number = 10;
        float marks = 12.33f;
        char ch = 'A';
        double largeDecimalNumbers = 1332233.333;
        long largeIntegervalues = 233232343223L;
        boolean check = true;
        short sh = 90;
        byte bd = 78;

    // Wrapper Classes - basically if want additional functionalities using (.) operator
    Integer rno = 64;
    rno.intValue();
    System.out.println("Int Value using Wrapper class methods" + rno.intValue());
    
    int bigNum = 234_000_333; //Output 234000333
    System.out.println(bigNum);

    // TYPE CONVERSION -> When one type of data is assigned to another type of variable, then automatic type conversion takes place
    float floatNumber = input.nextInt();
    System.out.println(floatNumber); // Type should be compatible (Float is greather than Integer)

    // TYPE CASTING -> Compressing the bigger number into smaller type explicitly (Manual Conversion)
    int newDigit = (int)(78.344f);
    System.out.println(newDigit);

    // Automatic Type Promotion in expressions
    int a = 257; // Maximum value of byte is 256
    byte b = (byte)(a);
    System.out.println(b); // 257 % 256 = Output 1

    }    
}
