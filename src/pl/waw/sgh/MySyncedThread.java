package pl.waw.sgh;

/**
 * Created by Fangshu Gao on 2017-01-11.
 */
public class MySyncedThread extends Thread {

    private static Object lock = new Object();
    private int iterator = 0;
    private String name;
    private static int n = 0;

    public MySyncedThread(String name, int i) {
        this.name = name;
        this.iterator = i;
    }

    public void run() {
        try{
            int i = 0;
            while (n<300) {
                synchronized (lock) {
                    while (iterator != (n-i*3)) {
                        lock.wait();
                    }
                    System.out.println(name + ": " + iterator + " n: " + n);
                    n++;
                    lock.notifyAll();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MySyncedThread("A", 0)
    }
}
