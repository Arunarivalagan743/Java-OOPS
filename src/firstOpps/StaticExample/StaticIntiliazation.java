package firstOpps.StaticExample;

public class StaticIntiliazation {

    static  int a = 2;
    static int b;

    static {
        b = a +3;
        System.out.println("In the static block");
    }
}
class  main{
    public static void main(String[] args) {
        StaticIntiliazation s = new StaticIntiliazation();
        System.out.println(StaticIntiliazation.a  + " "+ StaticIntiliazation.b);

        StaticIntiliazation.b+=4;
        StaticIntiliazation s2 = new StaticIntiliazation();
        System.out.println(StaticIntiliazation.a  + " "+ StaticIntiliazation.b);

//here is the two objects are created when calss loaded but only one time only static block only called when 1st time object created
    }
}
