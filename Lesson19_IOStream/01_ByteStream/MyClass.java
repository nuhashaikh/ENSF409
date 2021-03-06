//package edu.ucalgary.ensf409;
import java.io.*;

public class MyClass {
	FileInputStream in = null;
	FileOutputStream out = null;

	public static void main(String[] args) {
		var myself = new MyClass();
		myself.transfer();
	}

	public void transfer() {
		String inName = "in.txt";
		String outName = "out.txt";
		try {
			// Open an inputstream and output stream
			var in = new FileInputStream(inName);
			var out = new FileOutputStream(outName);
			int c;

			// Read from in until we reach the end of file (-1)
			while ((c = in.read()) != -1) {
				// Write what we have read to the output file
				out.write(c);
				// Print to the screen what we have read in
				System.out.print(c);
			}
		}

		catch (FileNotFoundException e) {
			System.out.println("Unable to find file " + inName);
			e.printStackTrace();
		}
	
		catch (IOException e) {
			System.out.println("I/O exception when trying to read " + inName
				+ "/write " + outName);
			e.printStackTrace();
		}

		finally {
			// Close in
			if (in != null) {
				try {
					in.close();
				}
				catch (IOException e) {
					System.out.println("Couldn't close file " + inName);
					e.printStackTrace();
				}
			}
			// Close out
			if (out != null) {
				try {
					out.close();
				}
				catch (IOException e) {
					System.out.println("Couldn't close file " + outName);
					e.printStackTrace();
				}
			}
		}
		System.out.println();
	}
}

