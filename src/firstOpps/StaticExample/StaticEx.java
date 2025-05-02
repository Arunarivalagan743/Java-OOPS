package firstOpps.StaticExample;

public class StaticEx {
      String name;
      int std;
      boolean percent;
    static   int student;  //it is belong to the class  not as  for object



    static void mass()
    {
        System.out.println("In static method cannot use to this keyword to refrence the field of the object ");
       // .this.age;
    }
    public StaticEx(String name, int std, boolean percent) {
        this.name = name;
        this.std = std;
        this.percent = percent;
        StaticEx.student +=2 ;  //this will common for all objeect belonging to the cllass for ec=ach object it will increement because it common to increemnt to all object of the claas
    }

}

class Main{
    public static void main(String[] args) {/// why main is static without creating an object to run this main method and it is belonging to class
        StaticEx std1 = new StaticEx("arun",9,true);
        StaticEx std2 = new StaticEx("hari",10,false);

        System.out.println(StaticEx.student);
//        message();
       gun();
       Main funn = new Main();
       funn.message2();

//if u can call a non static method u can create object in the  main class to call the non static method message ()
    }
    static void gun()
    {
       Main m = new Main();  //wheter u can a method be satic inside to  call a non sattic method be these example to replace and create a construtor of the same name
       m.message();
        System.out.println("Non static method is printed");
    }

    void message2()
    {
        System.out.println("message 2 is excuted");
        message();
    }
   void message()  //u can call this method by static method class or u do not to access this method be non static called by static method
    {

        System.out.println("Hi gun ");

    }
}


