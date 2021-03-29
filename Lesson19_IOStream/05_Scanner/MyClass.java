import java.util.Scanner;
import java.io.*;

public class MyClass {
	public static void main(String[] args) {
		Scanner scan = null;

		try {
			scan = new Scanner(new BufferedReader(new FileReader("example.txt")));
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
		}

		catch (Exception e) {
			System.out.println("Error occurred");
			e.printStackTrace();
		}

		finally {
			if (scan != null) {
				scan.close();
			}
		}
		
	}
}
