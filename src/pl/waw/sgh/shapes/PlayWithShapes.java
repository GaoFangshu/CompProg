package pl.waw.sgh.shapes;

import java.util.Arrays;

/**
 * Created by prubac on 16.11.2016.
 */
public class PlayWithShapes {

    public static void main(String[] args) {
        Shape rect1 = new Rectangle(2,3);
//        System.out.println(rect1);
        //System.out.println(rect1.calculateSurface());

        Shape shape1 = new Circle(2);
//        System.out.println(shape1);

        Shape shape2 = new EqTriangle(2);
//        System.out.println(shape1);


        Shape[] shapes = new Shape[] {
                rect1, shape1, shape2,
                new Circle(5)
        };
        for (Shape sh : shapes) {
            System.out.println(sh.toString());
            System.out.println("Surface: " + sh.calculateSurface());
            System.out.println("Perimeter:" + sh.calculatePerimeter());
        }
        System.out.println();

        Arrays.sort(shapes);

        for (Shape sh : shapes) {
            System.out.println(sh.toString());
            System.out.println("Surface: " + sh.calculateSurface());
            System.out.println("Perimeter:" + sh.calculatePerimeter());
        }


//        PerimeterCalculation pm = new EqTriangle(4);
//        System.out.println(pm);
//        System.out.println(pm.calculatePerimeter());



    }
}
