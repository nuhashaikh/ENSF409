import java.lang.*;
import java.util.Random;

public class SimpleThread extends Thread {
    public void run() {
        // Delay the simplethread a random amount of time, then output
        Random rand = new Random();
        int delay = rand.nextInt(250);
        try {
            Thread.sleep(delay);
            System.out.println("SimpleThread reached the output phase.");
        }
        catch (InterruptedException e) {
            System.out.println("SimpleThread was interrupted from sleep.");
        }
    }

    public static void main(String args[]) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Main is starting iteration " + i);
            SimpleThread st = new SimpleThread();
            AdditionalThread at = new AdditionalThread();
            st.start();
            at.start();
        }
    }
}

class AdditionalThread extends Thread {
    public void run() {
        // Delay the AdditionalThread a random amount of time, then output
        Random rand = new Random();
        int delay = rand.nextInt(250);
        try {
            Thread.sleep(delay);
            System.out.println("AdditionalThread reached the output phase.");
        }
        catch (InterruptedException e) {
            System.out.println("AdditonalThread was interrupted from sleep.");
        }
    }
}


