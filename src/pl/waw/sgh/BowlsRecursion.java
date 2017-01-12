package pl.waw.sgh;

/**
 * Created by prubac on 26.10.2016.
 */
public class BowlsRecursion {


    static int countBowls(int m) {
        if (m==1) return 1;
        else return countBowls(m-1) + m;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("n=5, bowls=" + countBowls(n));
    }

}
