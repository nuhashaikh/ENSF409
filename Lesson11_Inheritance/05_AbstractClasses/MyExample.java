abstract class Animal {
	public void eat() {
		System.out.println("Method eat is supplied by Animal");
	}
}

abstract class Swimmer extends Animal {
	public void swim() {
		System.out.println("Method swim is supplied by Swimmer");
	}
}


class Trilobite extends Swimmer {
	public void isExtinct() {
		System.out.println("Method isExtinct is supplied by Trilobite");
	}
}

public class MyExample {
	public static void  main(String[] args) {
		var myTrilobite = new Trilobite();
		myTrilobite.swim();
		myTrilobite.eat();
		myTrilobite.isExtinct();

	}
}
