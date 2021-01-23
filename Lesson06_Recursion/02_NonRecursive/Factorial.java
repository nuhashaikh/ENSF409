public class Factorial {
	public static int calculateFactorial(int num)	{
		if (num < 0) {
			throw new IllegalArgumentException(
			  "Factorial is not defined for negative numbers");
		}

		int sum = 0;
		for (int i=0; i <= num; i++) {
			sum += i;	
		}

		// By definition, 0! is 1.
		if (sum == 0) {
			return 1;
		} else {
			return sum;
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
