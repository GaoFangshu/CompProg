package pl.waw.sgh;

import java.util.Scanner;

/**
 * Created by prubac on 02.11.2016.
 */
public class ScannerIn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide date or hit CTRL+D to end");
        Integer numElem = -1;
        while (!numElem.equals(0) && scanner.hasNext()) {
            try {
                String input = scanner.next();
                numElem = Integer.parseInt(input);
                //numElem = scanner.nextInt();
                System.out.println("I got: " + numElem);
            } catch (NumberFormatException ne) {
                System.out.println("Input must be a number!!!");
            }
        }


    }
}
