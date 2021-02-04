class Animal {
	private int age;

	public Animal(int age) {
		this.setAge(age);
	}

	public Animal() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("Nom nom nom");
	}
}

public class Bird extends Animal {
	private int wingspan;

	public Bird(int age) {
		super(age);
	}

	// This is an example of calling the superclass's
	// constructor without any arguments. The call to
	// super is required to ensure the object is properly
	// initialized.
	public Bird() {
		super();
	}

	public Bird(int age, int wingspan) {
		super(age);
		this.setWingspan(wingspan);
	}

	public int getWingspan() {
		return this.wingspan;
	}

	public void setWingspan(int wingspan) {
		this.wingspan = wingspan;
	}

	public void eat() {
		System.out.println("Peck, peck, peck!");
	}

	public static void  main(String[] args) {
		Bird cormorant = new Bird(3, 50);
		Bird chicken = new Bird();
		chicken.setWingspan(45);
		chicken.setAge(3);

		System.out.println("A cormorant is a bird "+
			"with a " + cormorant.getWingspan() +
			" centimeter wingspan.");

		System.out.println("A chicken is a bird "+
			"with a " + chicken.getWingspan() +
			" centimeter wingspan. They peck "
			+ "at food.");
		chicken.eat();
	}
}
