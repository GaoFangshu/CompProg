package pl.waw.sgh.collections;

import pl.waw.sgh.shapes.Circle;
import pl.waw.sgh.shapes.EqTriangle;
import pl.waw.sgh.shapes.Rectangle;
import pl.waw.sgh.shapes.Shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by prubac on 23.11.2016.
 */
public class PlayWithCollections {

    public static void main(String[] args) {
//        Collection<Shape> cl = new ArrayList<Shape>();
        List<Shape> cl = new ArrayList<Shape>();
        Circle ci = new Circle(5);
        cl.add(ci);
        cl.add(new EqTriangle(2));
        cl.add(new Rectangle(6,7));
        cl.add(ci);

        //System.out.println(cl.get(0));
        cl.add(2, new EqTriangle(6));

        System.out.println();
        for (Shape sh : cl) {
            System.out.println(sh);
            System.out.println(sh.calculateSurface());
        }
        System.out.println("--------------");
        //cl.remove(1);
        boolean success = cl.remove(ci);
        success = cl.remove(ci);
        success = cl.remove(ci);
        for (Shape sh : cl) {
            System.out.println(sh);
            System.out.println(sh.calculateSurface());
        }
    }
}
