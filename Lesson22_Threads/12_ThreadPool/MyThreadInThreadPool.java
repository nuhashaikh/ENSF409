import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadInThreadPool implements Runnable{
	
	private int id;
	
	public MyThreadInThreadPool (int id) {
		this.id = id;
	}
	
	public void run () {
		System.out.println("Starting: " + id);
		
		try {
			Thread.sleep(1000);
			
		}
                catch (InterruptedException e) {}
		System.out.println("Completed: " + id);
	}

}

