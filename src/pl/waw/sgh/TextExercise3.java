package pl.waw.sgh;

/**
 * Created by prubac on 19.10.2016.
 */
public class TextExercise3 {

    public static void main(String[] args) {
        String s1 = "abcdefghijk";

        String s2 = s1.replace("b", "123");

        System.out.println(s2);

        System.out.println(s1.indexOf("cde5"));

        System.out.println(s1.substring(4));
        System.out.println(s1.substring(4, 6));

        String s3 = "abc";
        String s4 = "abc";
        //String s4 = new String("abc");
        s4 = s4 + "d";
        s4 = s4.substring(0,3);

        boolean stringsEqual = s3 == s4;
        System.out.println(stringsEqual);

        boolean stringsEqualByVal = s3.equals(s4);
        System.out.println(stringsEqualByVal);

    }
}
