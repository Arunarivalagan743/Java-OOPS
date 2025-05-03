package firstOpps.Inheritance;

class Main {
    public static void main(String[] args) {
        Box a = new Box();
        Box b = new Box(4);
        Box c = new Box(3, 4);     // Fixed: use two-argument constructor
        Box d = new Box(a);        // Copy constructor
        Weight w = new Weight(4, 9, 8);  //child is inherit all field of the parent becuse it in herits the patrent

        System.out.println(w.h + " " + w.weight + " " + w.l);  // From Weight object
//        System.out.println(b.l + " " + b.h);                   // From Box (cube)
//        System.out.println(c.l + " " + c.h);                   // From Box (rectangle)
//        System.out.println(d.l + " " + d.h);                   // From copy


        Box box = new Weight(1, 3, 4);  //here class weight object is create d by Box class type reference using refrence variable of the object box is only to accesss tthe Box fields only

//        System.out.println(box.h);       // ✅ Allowed
//        System.out.println(box.l);       // ✅ Allowed
//        System.out.println(box.weight);  // ❌ Compile-time error: weight is not in Box

//        Weight w = (Weight) box;
//        System.out.println(w.weight); // ✅ Works now
        //  Weight w = new Box(1, 2,5);here in the type refernece of weight only have initialzed the weight not l and h
        //so it became error
    }
}
