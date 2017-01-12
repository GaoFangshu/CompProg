package pl.waw.sgh.shapes;

/**
 * Created by prubac on 16.11.2016.
 */
public abstract class Shape
        implements PerimeterCalculation,
        Comparable<Shape> {

    protected double parA;
    protected double parB;

    public Shape(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public void setParams(double parA, double parB) {
        this.parA = parA;
        this.parB = parB;
    }

    public abstract double calculateSurface();

    @Override
    public int compareTo(Shape shape) {
        if (shape.calculateSurface()==this.calculateSurface())
            return 0;
        else if (shape.calculateSurface()>this.calculateSurface())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{" +
                "parA=" + parA +
                ", parB=" + parB +
                '}';
    }
}
