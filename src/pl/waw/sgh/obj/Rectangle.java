package pl.waw.sgh.obj;

/**
 * Created by prubac on 16.11.2016.
 */
public class Rectangle {

    private double sideA = 0;
    private double sideB = 0;

/*    public Rectangle() {
        sideA = 2.5;
        sideB = 3;
    }*/

    public Rectangle(double sideA, double sideB) {
        setParams(sideA, sideB);
    }

    private void setParams(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calculateSurface() {
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return "Rectangle[" + sideA + ", " + sideB + "]";
    }
}
