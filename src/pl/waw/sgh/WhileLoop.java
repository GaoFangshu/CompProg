package pl.waw.sgh;

/**
 * Created by prubac on 26.10.2016.
 */
public class WhileLoop {

    public static void main(String[] args) {

        int a = 8;
        while (a > 4) {
            System.out.println("While is executing");
            a--;
        }

        int b = 1;
        do {
            System.out.println("Do while is executing, iteration: " + b);
            // stop a loop
            if (b==3) break;
            b++;
        } while (b < 5);

        int i = 0;
        while (i < 10) {
            i++;
            if (i==6) continue;
            System.out.println("While is executing, iter: " + i);

        }


    }
}
