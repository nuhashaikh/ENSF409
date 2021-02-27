import edu.ucalgary.ensf409.*;
import edu.ucalgary.ensf409.subclass.ThreeClass;

public class OneClass {

	public static void main(String args[]) {
		TwoClass object = new TwoClass(2);
		object.output();

		ThreeClass third = new ThreeClass(200);
		third.output();
	}
}
