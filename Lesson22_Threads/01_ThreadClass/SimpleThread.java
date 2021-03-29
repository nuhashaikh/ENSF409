import java.lang.*;

public class SimpleThread extends Thread {
    public void run() {
        System.out.println("A simple thread that doesn't do much.");
    }

    public static void main(String args[]) {
        SimpleThread t = new SimpleThread();
        t.start();
    }
}
