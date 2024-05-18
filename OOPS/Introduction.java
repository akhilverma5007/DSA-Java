package OOPS;
public class Introduction{
    public static void main(String[] args) {
        // Store 5 roll nos
        // int[] roll = new int[5];

        // // Store 5 names
        // String[] names = new String[5];

        // // data of 5 students: {roll nos, names, marks}
        // int[] rollnos = new int[5];
        // String[] namesOfStudents = new String[5];
        // float[] marks = new float[5];

        // Here classes comes in action
        Student[] students = new Student[5];
        Student akhil = new Student();
        Student abhi = new Student();
        Student newAkhil = new Student(10, "newAkhil", 97.3f);

        System.out.println("new : " + newAkhil.name);

        // akhil.rno = 34;
        // akhil.name = "akhil";
        // akhil.marks = 94.23f;

        // abhi.rno = 78;
        // abhi.name = "abhi";
        // abhi.marks = 76.22f;

        // System.out.println(akhil.rno);
        // System.out.println(akhil.name);
        // System.out.println(akhil.marks);

        // System.out.println(abhi.rno);
        // System.out.println(abhi.name);
        // System.out.println(abhi.marks);
        
    }
}

 // create a class
 class Student{
    int rno;
    String name;
    float marks;


    // Constructor
        // runs when you create a new Object

    Student(){
        this.rno = 13;
        this.name = "Akhil Verma";
        this.marks = 75.3f;
    }

    Student(int rnumber, String name_n, float marks_n){
        this.rno = rnumber;
        this.name = name_n;
        this.marks = marks_n;
    }
}

