package firstOpps.Inheritance;

public class Box {
    double h;
    double l;

    // Default constructor
    public Box() {
        this.l = -1;
        this.h = -1;
    }

    // Cube constructor
    public Box(double side) {
        this.l = side;
        this.h = side;
    }

    // Parameterized constructor
    public Box(double h, double l) {
        this.h = h;
        this.l = l;

    }

    // Copy constructor
    public Box(Box old) {
        this.h = old.h;
        this.l = old.l;
    }
}



