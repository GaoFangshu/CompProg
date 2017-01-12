package pl.waw.sgh;

/**
 * Created by prubac on 19.10.2016.
 */
public class Conditions {

    static boolean isGrownUp(int age) {
        //return age >= 18;

//        boolean result = age >= 18;
//        return result;
//
        if (age>=18) return true;
        else return false;
    }

    static void myProcedure(int noOfLines) {
        System.out.println("my proc 1 line");
        if (noOfLines < 2) return;
        System.out.println("my proc 2 line");
    }


    public static void main(String[] args) {

        String s ="a";

        switch (s) {
            case "a":
                System.out.println("s is a");
                //break;
            case "ab":
                System.out.println("s is ab");
                //break;
            case "abc":
                System.out.println("s is abc");
                break;
            default:
                System.out.println("default");
        }

        boolean result = isGrownUp(43);
        System.out.println("is grown up at age 43: " + result);
        System.out.println("is grown up at age 13: " + isGrownUp(13));

        myProcedure(3);
        myProcedure(1);

    }
}
