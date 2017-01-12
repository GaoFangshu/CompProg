package pl.waw.sgh;

/**
 * Created by prubac on 02.11.2016.
 */
public class Arrays {

    public static void main(String[] args) {
//        int[] arrInt = new int[4];

        Integer[] arrInt = new Integer[4];
        arrInt[0] = 45;
        arrInt[1] = 67;
        arrInt[2] = 89;
        //arrInt[3] = 0;

        /*for (int i=0;i<arrInt.length;i++) {
            System.out.println("Element " + i + "=" + arrInt[i]);
        }*/

        for (Integer a : arrInt) {
            System.out.println(a);
        }





    }

}
