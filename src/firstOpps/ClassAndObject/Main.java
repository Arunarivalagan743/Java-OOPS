package firstOpps.ClassAndObject;

class Main {


    public static void main(String args[]) {
        ClassAndObjectSetExample s1 = new ClassAndObjectSetExample("Hari",12,54); //where s1 is reference varible of class
//        s1.hello();
        s1.display();
        System.out.println("1st object is printd");


//        for (int i = 0; i <1000000 ; i++) {//when it is over limit of object creation it will be destroyed
//            ClassAndObjectSetExample s2 = new ClassAndObjectSetExample();      s2.hello();
//            s2.display();
//
//        } //according to the parrameter it will go to the constructor method eg s2 has a 0 parameter it will go 0 parameter constructor method

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