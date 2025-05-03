package firstOpps.SingletonClass;

public class Singleton {  //It is to avoid multiple instance or objects .So it reamin same when the first object is create dof same values displayed on the every remaoing objects values be called

    private static Singleton ins;


    private String name;

    public Singleton(String name) {
        this.name = name;
    }

    private Singleton() {
    }

    public static Singleton instance() {
        if (ins == null) { //when creae the first instance it will be and create a iinstance
           Singleton ins = new Singleton();
        }//otherwise it return last instance value
        return ins;
    }


    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        } else {
            System.out.println("name is already exists");
        }
    }

    public String getName() {
        return name;
    }
}

