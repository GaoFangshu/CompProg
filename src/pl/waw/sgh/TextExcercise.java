package pl.waw.sgh;

/**
 * Created by prubac on 12.10.2016.
 */
public class TextExcercise {

    public static void main(String[] args) {
        System.out.println("hello");
        String s1 = "abcaagagag";
        String s2 = "s1=" + s1;

        StringBuilder sb0 = null;
        StringBuilder sb = new StringBuilder();
        sb0 = sb;
        sb.append("abc");
        sb0.append("def");

        String s3 = sb.toString();
        System.out.println(s3);

        System.out.println(s2);

        Integer i = null;

        int a = 6;
        i = 6;
        Integer j = null;
        j = i;
        i = 8;
        System.out.println("a=" + a);
        System.out.println("i=" + i);
        System.out.println("j=" + j);


    }
}
