package pl.waw.sgh.shapes;

/**
 * Created by prubac on 23.11.2016.
 */
public class Circle extends Shape {
    public Circle(double parA, double parB) {
        super(parA, parB);
    }

    public Circle(double parA) {
        super(parA, 0);
    }

    @Override
    public double calculateSurface() {
        return Math.PI*Math.pow(parA,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*parA;
    }
}
