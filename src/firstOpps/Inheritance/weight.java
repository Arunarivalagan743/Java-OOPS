package firstOpps.Inheritance;

// Subclass
class Weight extends Box {
    double weight;


    Weight(Box other) {
        super(other);
        this.weight = weight;

    }
    public Weight(double h,double l,double weight) {
       super(h,l); // Initialize Box part  It is calling parent class constructor
        this.weight = weight;

    }
}
