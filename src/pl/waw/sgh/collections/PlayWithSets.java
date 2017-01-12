package pl.waw.sgh.collections;

import pl.waw.sgh.shapes.Circle;
import pl.waw.sgh.shapes.EqTriangle;
import pl.waw.sgh.shapes.Rectangle;
import pl.waw.sgh.shapes.Shape;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by prubac on 30.11.2016.
 */
public class PlayWithSets {

    public static void main(String[] args) {
//        Collection<Shape> cl = new ArrayList<Shape>();
        Set<Shape> cl = new HashSet<>();
        Circle ci = new Circle(5);
        //Circle ci2 = ci;
        Circle ci2 = new Circle(5);
        cl.add(ci);
        cl.add(new EqTriangle(2));
        cl.add(new Rectangle(6,7));
        cl.add(ci2);

        //System.out.println(cl.get(0));
     //   cl.add(2, new EqTriangle(6));
        //cl.

        cl.remove(ci);

        //System.out.println();
        for (Shape sh : cl) {
            System.out.println(sh);
            System.out.println(sh.calculateSurface());
        }

    }
}
