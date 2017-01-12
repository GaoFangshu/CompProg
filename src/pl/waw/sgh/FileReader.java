package pl.waw.sgh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by prubac on 09.11.2016.
 */
public class FileReader {

    public static void main(String[] args)
            throws FileNotFoundException {
        File inputFile = new File("h:\\testfile.txt");
        Scanner scanner = new Scanner(inputFile);
        while (scanner.hasNext()) {
            String curLine = scanner.nextLine();
            System.out.println("Line: " + curLine);
            String[] elems = curLine.split(" ");
            for (int i=0;i<elems.length;i++) {
                System.out.println(
                        "elem " + i + ": " + elems[i]);
            }
        }
    }
}
