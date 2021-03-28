import java.lang.*;

public class MyThreads {
    public static void main(String args[]) {
        WaitForever obj = new WaitForever();
        Thread t = new Thread (obj);
        t.start();
    }
}


class WaitingOnThisThread implements Runnable {
    public void run() {
        synchronized(this) {
            System.out.println("WaitingOnThisThread has started.");

            // Sleep a short while
            try {
                Thread.sleep(60);
            }
            catch (InterruptedException e) {
                System.out.println("WaitingOnThisThread was interrupted with an exception.");
            }

            // Notify WaitForever
            notify(); 
            System.out.println("WaitingOnThisThread has ended.");
        }
    }
}

class WaitForever implements Runnable {
    public void run() {
        System.out.println("WaitForever has started.");

        // Launch another thread
        WaitingOnThisThread obj = new WaitingOnThisThread();
        Thread t = new Thread (obj);
        t.start();

        // We use synchronized to set exclusive access to this object.
        synchronized(t) {
             try {
                 // The current thread, WaitForever, will now wait indefinitely,
                 // or until notified by WaitingOnThisThread, when it will wake up.
                 // Using an alternate version of this, we can set an optional timer,
                 // and we will return to this thread at the end of the time or when we
                 // are notified, whichever comes first.
                 t.wait();
                 // t.wait(10);
             }
             catch (InterruptedException e) {
                 System.out.println("WaitForever was interrupted with an exception.");
             }
        }

        System.out.println("WaitForever has ended.");
    }
}
