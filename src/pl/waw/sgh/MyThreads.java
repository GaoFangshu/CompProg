package pl.waw.sgh;

/**
 * Created by Fangshu Gao on 2017-01-11.
 */
public class MyThreads {
    int MyThreadsIterator = 0;

    public synchronized void count (String name) {
        System.out.println("Thread: " + name + " current MyThreads iterator: " + MyThreadsIterator);
        MyThreadsIterator++;
    }

    public static void main (String[] args) {
        MyThreads myThreads = new MyThreads();

        OurThread threadA = new OurThread("A", myThreads);
        OurThread threadB = new OurThread("B", myThreads, threadA);
        OurThread threadC = new OurThread("C", myThreads, threadB);

        threadA.start();
        threadB.start();
        threadC.start();
    }
}
