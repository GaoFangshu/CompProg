package pl.waw.sgh.collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by prubac on 30.11.2016.
 */
public class ReadCSVandTranslate {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File(
                "H:\\Compprog\\src\\trans.txt");
        Map<String, String> map = new HashMap<>();

        map.put("hello", "bonjour");
        map.put("bye", "au revoir");
        map.put("cat", "chat");
        // watch out
        map.put("hello", "salut");
        map.put("hi", "salut");

        Scanner scanner = new Scanner(inputFile);
        List<String> listOfWords = new ArrayList<>();
        while (scanner.hasNext()) {
            String curLine = scanner.nextLine();
            System.out.println("Line: " + curLine);
            String[] elems = curLine.split(" ");
            listOfWords.addAll(Arrays.asList(elems));
        }

        for (String word : listOfWords) {
            String translation = map.get(word.toLowerCase());
            System.out.print(
                    (translation!=null ? translation : word)
                            + " "
            );
        }

    }
}
