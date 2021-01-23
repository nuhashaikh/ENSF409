public class Factorial {

	public static int calculateFactorial(int num) {
		if (num > 0) {
			return num + calculateFactorial(num - 1);
		} else {
			return 0;
		}
	}


	public static void main(String[] args) {
		int result = calculateFactorial(10);
		System.out.println(result);
	}
}
