import java.util.ArrayList;

public class Lambda {
	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<>();
		myList.add("This");
		myList.add("is");
		myList.add("some");
		myList.add("text.");

		// Example Lambda expression
		myList.forEach( (String v) -> {System.out.println(v);} );
	}

}
