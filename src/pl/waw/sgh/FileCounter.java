package pl.waw.sgh;

import java.io.File;

/**
 * Created by prubac on 26.10.2016.
 */
public class FileCounter {

    static int countFiles(File dir) {
        int counter = 0;
        for (int i=0;i<dir.listFiles().length;i++) {
            File file = dir.listFiles()[i];
            System.out.println((i+1) + ". " + file.getAbsolutePath() +
                    " " + file.length() + " " + file.isDirectory());
            counter++;
            if (file.isDirectory()) {
                counter = counter + countFiles(file);
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        /*
        \n - new line
        \t - tabulator
        \\ - \
        */
        System.out.println("Current dir: " + System.getProperty("user.dir"));
        //String dir = "T:\\eclipse\\OS";
        //String dir = "T:" + File.separator + "eclipse/OS";
        String dir = "T:\\eclipse\\vaadin-all-7.6.1";

        File directory = new File(dir);

        int counter = countFiles(directory);
        System.out.println("Files count: " + counter);
    }
}
