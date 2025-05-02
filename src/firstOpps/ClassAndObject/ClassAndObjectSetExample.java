
package firstOpps.ClassAndObject;


public class  ClassAndObjectSetExample {
    String name; //field
    int id;                  //when create a object as a instance variable
    float marks;

    ClassAndObjectSetExample(String name,int id,float marks) //according to the parameter it calling a constructor when object is create by as instaniated
    {
  this.name = name;  //this keyword is used to specifice which object is it calling the varible to define linke s1.name wwher name is instance variabke filde of the class
  this.id = id;
  this.marks =marks;
    }


    ClassAndObjectSetExample()
    {
       this.name = "arun"; //using this to fetch the variable via insde a class by object is no problem
        id = 14;
        marks = 89;
//        this("AK",78,99);//constructoris calling  from another  constructir by as in  the having the these type of arguments to intialize the variables
    }


    ClassAndObjectSetExample(    ClassAndObjectSetExample  cpyobj){
        this.name =    cpyobj.name;


    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyd");
    }

    public void display()  {//method
        System.out.println(name);
        System.out.println(id);
        System.out.println(marks);
    }


    public void SetValues(String n,int i,float m)
    {
        name = n;
        id =i;
        marks = m;
    }


    void hello()
    {
        System.out.println("Hello"+" "+ name +" " + "machi");
    }


}
class Main {


    public static void main(String args[]) {
        ClassAndObjectSetExample s1 = new ClassAndObjectSetExample("Hari",12,54); //where s1 is reference varible of class
//        s1.hello();
        s1.display();
        System.out.println("1st object is printd");


        for (int i = 0; i <1000000 ; i++) {//when it is over limit of object creation it will be destroyed
            ClassAndObjectSetExample s2 = new ClassAndObjectSetExample();      s2.hello();
            s2.display();

        } //according to the parrameter it will go to the constructor method eg s2 has a 0 parameter it will go 0 parameter constructor method

        System.out.println("S2 is printed");

//        ClassAndObjectSetExample s3= s2;
//        System.out.println(s3.name  + " "  + "refering to the different object innstance varible");


                s1.SetValues("Arun",11,89); //it will reassign the values in s1 object
        s1.display();
        s1.hello();


        ClassAndObjectSetExample  CopyObjectValue = new ClassAndObjectSetExample(s1);

        System.out.println( CopyObjectValue.name);

    }
}