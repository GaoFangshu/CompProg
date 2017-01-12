package pl.waw.sgh.obj;

/**
 * Created by prubac on 16.11.2016.
 */
public class PlayingWithRectangles {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 2);
        //r1.setParams(1.5, 2);
        System.out.println(r1.toString());
        System.out.println("R1 surface: " +
            r1.calculateSurface());

        Rectangle r2 = new Rectangle(6,2);
        //r2.setParams(1.5, 2);
        //r2.sideA = 4;
        //r2.toString();
        System.out.println(r2.toString());
        System.out.println("R2 surface: " +
                r2.calculateSurface());
    }
}
