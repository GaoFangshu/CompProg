package pl.waw.sgh;

/**
 * Created by prubac on 02.11.2016.
 */
public class InputArgs {

    public static void main(String[] args) {
        String ss = "34.34";
        double d = Double.parseDouble(ss);
        System.out.println("d=" + d);
        double sum = 0;
        for (String s : args) {
            System.out.println("arg: " + s);
            sum += Double.parseDouble(s);
        }
        System.out.println("Sum: " + sum);
    }
}
