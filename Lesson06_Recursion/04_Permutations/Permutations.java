public class Permutations {
	public static int permutations(int length, int select) {
                if (select < 0) {
                        throw new IllegalArgumentException(
                          "Permutations is not defined for negative numbers");
                }

		if (length < select ) {
                        throw new IllegalArgumentException(
                          "Selection cannot exceed array length");
		}

		if (select == 0) {
			return 1;
		} else {
			return length * permutations(length-1, select-1);
		}	
	}

	public static void main(String[] args) {
		String[] drinks = {"Water", "Milk", "Soda", "Tea"};
		int result = permutations(drinks.length, 4);
		System.out.println(result); // Expect 24

		String[] produce = {"Apple", "Cabbage", "Lettuce",
		  "Orange", "Radish"};
		result = permutations(produce.length, 3);
		System.out.println(result); // Expect 60

		result = permutations(produce.length, 1);
		System.out.println(result); // Expect 5

		result = permutations(produce.length, 0);
		System.out.println(result); // Expect 0

	}
}
