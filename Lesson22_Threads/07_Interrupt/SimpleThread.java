import java.lang.*;

public class SimpleThread implements Runnable {
    public void run() {
        System.out.println("Simple thread started.");
        try {
            Thread.sleep(10000);
        }
        catch (Exception e) {
            System.out.println("Simple thread was interrupted");
            e.printStackTrace();
        }
        System.out.println("Simple thread ended.");
      
    }

    public static void main(String args[]) {
        SimpleThread obj = new SimpleThread();
        Thread t = new Thread (obj);
        t.start();
        t.interrupt();
    }
}
