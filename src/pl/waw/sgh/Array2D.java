package pl.waw.sgh;

/**
 * Created by prubac on 16.11.2016.
 */
public class Array2D {

    public static void main(String[] args) {
        double[][] arr2d = new double[4][2];

        arr2d[0][0] = 43;
        arr2d[0][1] = 32;

        for (int i=0;i<arr2d.length;i++) {
            for (int j=0;j<arr2d[i].length ;j++) {
                System.out.print(arr2d[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
