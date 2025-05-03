package firstOpps.SingletonClass;

class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.instance();
        obj.setName("Arun");

        Singleton obj2 = Singleton.instance();
        obj2.setName("Hari");

        System.out.println(obj.getName());  // Arun
        System.out.println(obj2.getName());  //Arun
    }
}
