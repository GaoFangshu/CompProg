package pl.waw.sgh;

/**
 * Created by prubac on 12.10.2016.
 */
public class TextExercise2 {

    public static void main(String[] args) {
        int a = 5;

        String s1 = "sbcdafafarf";
        //s1 = s1 + a;
        Integer aa = new Integer(a);
        System.out.println("aa=" + aa);
        int s1len = s1.length();
        System.out.println("s1 length: "  + s1len);
        char ch = s1.charAt(4);
        System.out.println("Char no 5: " + ch);

//        s1 = s1 + aa;
//        s1 = s1 + aa.toString();
        //s1 = aa;
        s1 = aa.toString();
    }
}
