package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by prubac on 09.11.2016.
 */
public class CSVFileReader {

    public static void main(String[] args)
            throws FileNotFoundException {
        File inputFile = new File(
                "c:\\Users\\prubac\\Desktop\\Zeszyt1.csv");
        Scanner scanner = new Scanner(inputFile);
        Double totalSum = 0d;
        while (scanner.hasNext()) {
            String curLine = scanner.nextLine();
            System.out.println("Line: " + curLine);
            String[] elems = curLine.split(";");
            Double rowSum = 0d;
            for (int i=0;i<elems.length;i++) {
                Double dEl = Double.parseDouble(elems[i]);
                rowSum += dEl;
                System.out.println(
                        "elem " + i + ": " + dEl);
            }
            totalSum += rowSum;
            System.out.println("Row Sum: " + rowSum);
        }
        System.out.println("Total Sum: " + totalSum);
    }
}
