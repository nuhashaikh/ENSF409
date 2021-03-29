// Import statements are not required when we use the fully qualified names.
// import edu.ucalgary.ensf409.*;
// import edu.ucalgary.ensf409.layer.*;

public class OneClass {

	public static void main(String args[]) {
		var one = new edu.ucalgary.ensf409.TwoClass(2);
		one.output();

		var two = new edu.ucalgary.ensf409.layer.TwoClass(200);
		two.output();
	}
}
