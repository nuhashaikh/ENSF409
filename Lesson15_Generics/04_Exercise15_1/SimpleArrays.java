import java.util.*;

// Demonstration of using MyList generic 
public class SimpleArrays {
	public static void main(String[] args) {
		Integer one = 1;
		String hi = "Hi";

		MyList<Integer> integerMyList = new MyList<Integer>(one);
		MyList<String> stringMyList = new MyList<String>(hi);
		MyList<String> defaultMyList = new MyList<String>();

		System.out.println("Integer arrayConcat(1): " + integerMyList.arrayConcat(1));
		System.out.println("String arrayConcat(): " + stringMyList.arrayConcat());
		System.out.println("Default arrayConcat(2): " + defaultMyList.arrayConcat(2));

		System.out.println("Integer arrayCrop(3, 2): " + integerMyList.arrayCrop(3, 2));
		System.out.println("String arrayCrop(0, 4): " + stringMyList.arrayCrop(0, 4));
		System.out.println("Default arrayConcat(0, 0): " + defaultMyList.arrayCrop(0, 0));
	}
}

/*
  Some notes on the implementation: In Java, you would rarely opt to extend collections.
  This implementation is designed to show several different aspects of generics.
  The constructor which takes no arguments triggers the use of the static String ArrayList.
  The constructor which takes arguments relies on using the super for storage.
  Thus, each method must be prepared to operate on either the static variable or on this.

  The zero argument version of arrayConcat could have simply checked if the index was in
  bounds and called arrayCrop, similar to how the one-argument version of arrayConcat
  does. I opted to provide a distinct implementation of arrayConcat in order to show use
  of a generic variable (iterator). This is for illustration purposes only and is not good
  style.

  This implementation depends on every object type which is used implementing toString().
*/


// Example generic which implements exercise 4.1
class MyList<E> extends ArrayList<E> {
	static String var = "Hello, ENSF 409";
	static ArrayList<String> defaultTxt = new ArrayList<String>(Arrays.asList(var, var, var, var));

	public MyList(E var) {
		super();
		this.add(var);
		this.add(var);
		this.add(var);
		this.add(var);
	}

	public MyList() {
		super();
	}

	public String arrayConcat(int start) throws IndexOutOfBoundsException {
		// Operate on the static ArrayList because the zero-argument constructor was used
		if (this.size() == 0) {
			if ((start >= defaultTxt.size()) || (start < 0)) {
				throw new IndexOutOfBoundsException("Index " + start + " is out of bounds");
			}
			return arrayCrop(start, defaultTxt.size() - 1);

		}

		// Operate on object itself
		if ((start >= this.size()) || (start < 0)) {
			throw new IndexOutOfBoundsException("Index " + start + " is out of bounds");
		}
		return arrayCrop(start, this.size() - 1);
	}

	public String arrayConcat() {
		var theString = new StringBuilder();

		// Operate on the static ArrayList because the zero-argument constructor was used
		if (this.size() == 0) {
			Iterator<String> it = defaultTxt.iterator();
			while (it.hasNext()) {
				String value = it.next().toString();
				theString.append(value + "#");
			}

		// Operate on object itself
		} else {
			Iterator<E> it = this.iterator();
			while (it.hasNext()) {
				String value = it.next().toString();
				theString.append(value + "#");
			}
		}
		theString.deleteCharAt(theString.length() - 1);
		return theString.toString();
	}

	public String arrayCrop(int i, int j) {
		int start;
		int end;
		var theString = new StringBuilder();

		if (i == j) {
			return "Match";
		}

		if (i > j) {
			start = j;
			end = i;
		} else {
			start = i;
			end = j;
		}

		// Operate on the static ArrayList because the zero-argument constructor was used
		if (this.size() == 0) {
			if ((start >= defaultTxt.size()) || (end >= defaultTxt.size()) || (start < 0) || (end < 0)) {
				return "Fail";
			}
			for (int count = start; count <= end; count++) {
				String value = defaultTxt.get(count);
				theString.append(value + "#");
			}

		// Operate on object itself
		} else {
			if ((start >= this.size()) || (end >= this.size()) || (start < 0) || (end < 0)) {
				return "Fail";
			}
			for (int count = start; count <= end; count++) {
				String value = this.get(count).toString();
				theString.append(value + "#");
			}
		}

		theString.deleteCharAt(theString.length() - 1);
		return theString.toString();
	}
}
