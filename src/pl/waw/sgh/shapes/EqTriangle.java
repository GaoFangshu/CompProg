package pl.waw.sgh.shapes;

/**
 * Created by prubac on 23.11.2016.
 */
public class EqTriangle extends Shape {
    public EqTriangle(double parA, double parB) {
        super(parA, parB);
    }

    public EqTriangle(double parA) {
        super(parA, 0);
    }

    @Override
    public double calculateSurface() {
        return Math.pow(parA,2)*Math.sqrt(3)/4;
    }

    @Override
    public double calculatePerimeter() {
        return 3*parA;
    }

}
