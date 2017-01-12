package pl.waw.sgh;

/**
 * Created by prubac on 19.10.2016.
 */
public class ObjectComparison {

    static int b = 78;

    public static void main(String[] args) {

        Integer i1 = 5;
        Integer i2 = 2+3;
        i2 = 7;
        i2--;
        i2 = --i2;

        i2 = (new Integer(8)) - (new Integer(6));

        boolean intsEqual = i1 == i2;
        boolean intsEqualByVal = i1.equals(i2);

        System.out.println(intsEqual);
        System.out.println(intsEqualByVal);


        if (intsEqual) System.out.println("ints are equal");
        else System.out.println("ints are not equal");

        if (i1.equals(i2)) System.out.println("ints are equal");
        else System.out.println("ints are not equal");

        // >=
        // <=
        // >
        // <
        // == - only for primitive types
        // !=
        if (4 > 3 && 2 <= 2) System.out.println("AND expression is true");

        if (4 > 3 || 4 <= 2) System.out.println("OR expression is true");

        if (4 > 3 ^ 3 <= 2) System.out.println("XOR expression is true");

        if (!(4 > 5) && 1 <= 2) System.out.println("Negation expression is true");

        // No ; after condition
        if (1 > 10); System.out.println("Should not appear");


        // int a = 5;
        {
            int a = 5;
            System.out.println("new block line 1");
            System.out.println("new block line 2");
            {
                System.out.println(a);
                System.out.println(b);
            }
        }
//        System.out.println(a);

        if ("abc".equals("abc")) {
            System.out.println("stings are equal");
            System.out.println("it's raining");
        }






    }
}
