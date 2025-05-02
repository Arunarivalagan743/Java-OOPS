package firstOpps.ClassAndObject;


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class  ClassAndObjectExample {
    String name;
    int id;
    float marks;

    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(marks);
    }

    public static void main(String args[])
    {
        ClassAndObjectExample  s1 = new  ClassAndObjectExample ();
        System.out.println(s1.name + " " + "printed");
        s1.name ="Arun";
        s1.id =11;
        s1.marks = 7.8f;
        s1.display();
        ClassAndObjectExample  s2 = new  ClassAndObjectExample ();
        s2.name ="Hari" ;
        s2.id =12;
        s2.marks = 7.89f;

        s2.display();

    }
}