package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 * Created by prubac on 09.11.2016.
 */
public class FileWriter {

    public static void main(String[] args) {
        File newFile = new File("h:\\out.txt");
        try {
            java.io.FileWriter fw = new java.io.FileWriter(newFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append("my first line");
            bw.newLine();
            bw.append("my second line");
            bw.newLine();
            bw.close();
            fw.close();
        } catch (IOException ie) {
            System.out.println("File not found or not writable");
        }

    }
}
