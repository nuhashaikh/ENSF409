import java.util.stream.*;
import java.util.*;
  
public class ExampleStream {
        public static void main(String[] args) {

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
			.parallel()
			.forEach(s -> System.out.println(s));

		System.out.println();
		Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7 })
			.parallel()
			.average()
			.ifPresent(System.out::println);

		System.out.println();
		IntStream.range(1, 8)
			.parallel()
			.mapToObj(n -> "Int: " + n)
			.forEach(System.out::println);	
	}
}

