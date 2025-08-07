package javalab.ch08;


// parent class have to common properties and methods
// for children class
class Animal {
	public void move() {
		System.out.println("The animal is moving");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("The human walks on two leg.");

	}
	
	public void readBook() {
		System.out.println("The human read a book.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("The tiger walks on four leg.");

	}
	
	public void huntFood() {
		System.out.println("The tiger is hunting.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("The eagle soars in the sky.");

	}
	
	public void haveWing() {
		System.out.println("The eagle flies on its wings.");
	}
}




//

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

	}
	
	// Gaining flexibility through down casting.
	// animal act like array..? or list....?
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}


