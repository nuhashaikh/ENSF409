import java.lang.*;

public class SimpleThread implements Runnable {
    public void run() {
        System.out.println("A simple thread that doesn't do much.");
    }

    public static void main(String args[]) {
        SimpleThread obj = new SimpleThread();
        Thread t = new Thread (obj);
        t.start();
    }
}
