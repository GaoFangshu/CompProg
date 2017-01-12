package pl.waw.sgh;
MyThreads;

/**
 * Created by Fangshu Gao on 2017-01-11.
 */
public class OurThread extends Thread {

    private String name;
    private int interator;
    private   myThreads;
    private Thread nextThread;

    public OurThread (String name, MyThreads myThreads) {
        this.name = name;
        this.myThreads = myThreads;
    }

    public OurThread (String name, MyThreads myThreads, Thread nextThread) {
        this.name = name;
        this.myThreads = myThreads;
        this.nextThreads = nextThreads;
    }

    @Override
    public void run() {
        try {
            while (interator<20) {
                this.sleep(2000);
                System.out.println(name + ": " + interator);
                ourThreads.count(name);
                iterator++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
