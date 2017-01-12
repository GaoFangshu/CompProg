package pl.waw.sgh.shapes;

/**
 * Created by prubac on 16.11.2016.
 */
public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
       super(a,b);
    }

    @Override
    public double calculateSurface() {
        return parA*parB;
    }

    @Override
    public String toString() {
        return "I'm a rectangle";
    }

    @Override
    public double calculatePerimeter() {
        return 2*parA + 2*parB;
    }
}
