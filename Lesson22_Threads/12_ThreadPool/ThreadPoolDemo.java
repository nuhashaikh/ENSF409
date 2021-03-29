import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ThreadPoolDemo {
	
	public static void main (String [] args) throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new MyThreadInThreadPool(i));
		}
		
		executor.shutdown();
		System.out.println("All tasks submitted.");
		executor.awaitTermination(1,  TimeUnit.HOURS);
	}
}

