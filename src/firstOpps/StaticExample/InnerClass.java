package firstOpps.StaticExample;

public class InnerClass {

   static  class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

       @Override
       public String toString() {
           return name;
       }
   }
    public static void main(String[] args) {
        Test t = new Test("arun");
        Test t1 = new Test("hari");
        System.out.println(t);  //if we have custom to string to print name the return of string or it go to default tostring of has code
        System.out.println(t.name);
        System.out.println(t1.name);



    }
}
