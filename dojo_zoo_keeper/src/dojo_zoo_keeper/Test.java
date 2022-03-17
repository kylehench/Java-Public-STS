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
		
		System.out.println("\n--- Testing Bat ---");
		Bat bat = new Bat();
		bat.fly();
		bat.fly();
		bat.eatHumans();
		bat.eatHumans();
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.displayEnergyLevel();
	}

}
