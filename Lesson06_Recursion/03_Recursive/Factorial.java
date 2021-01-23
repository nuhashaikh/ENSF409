public class Factorial {

	public static int calculateFactorial(int num)	{
                if (num < 0) {
                        throw new IllegalArgumentException(
                          "Factorial is not defined for negative numbers");
                }

		if (num > 1) {
			return num + calculateFactorial(num - 1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		int result = calculateFactorial(10);
		System.out.println(result);

		result = calculateFactorial(1);
		System.out.println(result);

		result = calculateFactorial(0);
		System.out.println(result);
	}
}
