package pl.waw.sgh;

/**
 * Created by prubac on 26.10.2016.
 */
public class ForLoop {

    public static void main(String[] args) {

        //int i;

        for (int i=0;i<5;i++) {
            for (int j=0;j<i;j++) {
                System.out.println("For executing: " + i + " " + j);
            }
        }

    }
}
