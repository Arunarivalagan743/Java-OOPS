package firstOpps.access;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Arun");
        int n = obj.num;

        System.out.println(obj instanceof A);
    }
}
//
//| Modifier    | Same Class | Same Package | Subclass (diff pkg) | Other Packages |
//        | ----------- | ---------- | ------------ | ------------------- | -------------- |
//        | `public`    | ✅          | ✅            | ✅                   | ✅              |
//        | *default*   | ✅          | ✅            | ❌                   | ❌              |
//        | `protected` | ✅          | ✅            | ✅                   | ❌              |
//        | `private`   | ✅          | ❌            | ❌                   | ❌              |
