package pl.waw.sgh;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by prubac on 16.11.2016.
 */
public class FileListingFiltered {

    public static void main(String[] args) {

        String dir = "h:\\";
        File directory = new File(dir);
        File[] filesFound = directory.listFiles(
                new FileFilter() {
            @Override
            public boolean accept(File file) {

                try {
                    String fileType =
                            Files.probeContentType(file.toPath());
                    System.out.println(file.getName() + " " + fileType);
                } catch (IOException io) {
                    return false;
                }


                if (file.getName().endsWith("html"))
                    return true;
                else
                    return false;
            }
        });

        for (File f : filesFound)
            System.out.println(f.getName());

    }
}
