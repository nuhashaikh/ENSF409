import java.lang.*;

public class MyThreads {
    public static void main(String args[]) {
        // Create a thread and output its information. Default name, default priority.
        System.out.println("Default name, default priority");
        OneThread obj = new OneThread();
        Thread t = new Thread (obj);
        t.start();
        printInfo(t, "t");

        // Create a thread and output its information. Default name, default priority.
        OneThread obj2 = new OneThread();
        Thread t2 = new Thread (obj2);
        t2.start();
        printInfo(t2, "t2");

        // Modify the name and priority of one thread, then output its information.
        System.out.println("\nRevised name, revised priority");
        t.setName("Alberta");
        t.setPriority(Thread.NORM_PRIORITY +2);
        printInfo(t, "t");

        // Set threads with the other two priority properties
        System.out.println("\nRevised priority");
        t.setPriority(Thread.MIN_PRIORITY);
        printInfo(t, "t");
        t2.setPriority(Thread.MAX_PRIORITY);
        printInfo(t2, "t2");
 
        // Set the thread with a priority using an int from 1-10
        t.setPriority(4);
        printInfo(t, "t");
    }

    public static void printInfo (Thread t, String varName) {
        String name = t.getName();
        String status = String.valueOf(t.isAlive());
        String priority = String.valueOf(t.getPriority());
        System.out.println("(main) Thread " + varName + " is named: " + name + ", priority is: " + priority +
            ", status is: " + status);
    }
}


class OneThread implements Runnable {
    public void run() {
        System.out.println("(run) Thread " + Thread.currentThread().getName() + " has started.");

        try {
            // Use a very short sleep so that we can see different values for isAlive()
            Thread.sleep(1);
        }
        catch (InterruptedException e) {
                System.out.println("(run) Thread " + Thread.currentThread().getName() + " was interrupted.");
        }

        System.out.println("(run) Thread " + Thread.currentThread().getName() + " has ended.");
    }
}
