package pl.waw.sgh;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        int a;
        a = 5;
        a = a + 100;
        byte b = 5;
        b = 100;

        long c = 50;
        c = c*67;
        a = a/b;
        System.out.println("a=" + a);
        System.out.println(c);

        double d = 67.785454647467458758585858585435353535;
        System.out.println("d=" + d);

        float f = 67.785454647467458758585858585435353535f;
        System.out.println("f=" + f);

        d = a;
        d = d/100;

        System.out.println("d=" + d);

        a = new Double(d).intValue();

        d = f;

        Integer i = 45;
        System.out.println("i=" + i);

        Long abc = 45L;

        char ch = 'a';
        String s = "a";
        String s2 = "" + ch + ch;
        System.out.println("s2="+s2);




    }
}
