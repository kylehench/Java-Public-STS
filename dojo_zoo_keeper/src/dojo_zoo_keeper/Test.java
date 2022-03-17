package dojo_zoo_keeper;

public class Test {
	public static void main(String[] args) {
//		import org.junit.jupiter.api.Test;
		Mammal mammal = new Mammal();
		mammal.displayEnergyLevel();
		
		Gorilla gorilla = new Gorilla();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.climb();
		gorilla.displayEnergyLevel();

	}

}
