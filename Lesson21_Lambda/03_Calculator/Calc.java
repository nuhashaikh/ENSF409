public class Calc {
	public interface MathWithInts {
		public int operation(int a, int b);   
	}
  
	public int twoDigitOp(int a, int b, MathWithInts op) {
		return op.operation(a, b);
	}
 
	public static void main(String[] args) {
		MathWithInts multiplication = (a, b) -> a * b;

 		// Alternative:
		//  MathWithInts multiplication = (a, b) -> {return a * b;};

		Calc myApp = new Calc();
		System.out.println("2 * 10 = " +
			myApp.twoDigitOp(2, 10, multiplication));	
	}
}
