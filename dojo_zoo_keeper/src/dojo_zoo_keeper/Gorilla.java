package dojo_zoo_keeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		changeEnergyLevel(-5);
		System.out.println("The gorilla has thrown something.");
	}
	public void eatBananas() {
		changeEnergyLevel(10);
		System.out.println("The gorilla ate a banana and is feeling satisfied.");
	}
	public void climb() {
		changeEnergyLevel(-10);
		System.out.println("The gorilla climbed a tree.");
	}
}