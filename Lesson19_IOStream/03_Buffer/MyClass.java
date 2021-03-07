import java.io.*;

public class MyClass {
	public static void main(String[] args) throws Exception {
		var out = new PrintWriter(System.out);
		out.write("Manual flush.");
		Thread.sleep(2000);
		out.flush();

		out.println();
		out.printf("My cat is %d years old.", 11);	
		out.println();
		Thread.sleep(2000);
		out.close();
	}
}
