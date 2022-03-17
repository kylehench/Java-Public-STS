package dojo_zoo_keeper;

public class Bat extends Mammal {
	public Bat() {
		setEnergyLevel(300);
	}
	public void fly() {
		System.out.println("***swoosh***swoosh***swoosh***");
		changeEnergyLevel(-50);
	}
	public void eatHumans() {
		changeEnergyLevel(25);
	}
	public void attackTown() {
		System.out.println("***sounds of flames and burning town***");
		changeEnergyLevel(-100);
	}
}