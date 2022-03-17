package dojo_zoo_keeper;

public class Mammal {
	private int energyLevel = 100;
	
	public int displayEnergyLevel() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	public void changeEnergyLevel(int change) {
		energyLevel += change;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
