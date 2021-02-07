class ChildClass extends ParentClass {

	int x = 409;

	public void display() {
		System.out.println("Method display called from ChildClass");
		System.out.println("Subclass x value: " + x); 
		System.out.println("Super class x value: " + super.x); 
		super.display(); 
	}
}

public class DemonstrateSuper {
	public static void main(String args[]) {
		var childObject = new ChildClass();
		childObject.display();
	}
}


class ParentClass {
	int x = 1;
  
	public void display() {
		System.out.println("Method display called from ParentClass");
	}
}
