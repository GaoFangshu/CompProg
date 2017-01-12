package pl.waw.sgh.collections;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by prubac on 30.11.2016.
 */
public class PlayWithMaps {

    public static void main(String[] args) {
        //Map<String, String> map = new LinkedHashMap<>();

        Map<String, String> map = new TreeMap<>();

        map.put("hello", "bonjour");
        map.put("bye", "au revoir");
        map.put("cat", "chat");
        // watch out
        map.put("hello", "salut");
        map.put("hi", "salut");

        //map.put("Hello", "Bonjour", "Hallo")

/*
        for (String val : map.values()) {
            System.out.println(val);
        }
*/

        for (String key : map.keySet()) {
            System.out.println
                    ("EN: " + key + " FR: " + map.get(key));
        }





    }
}
