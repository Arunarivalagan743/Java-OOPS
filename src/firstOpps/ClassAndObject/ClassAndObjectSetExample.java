
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
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("destroyd");
//    }

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
