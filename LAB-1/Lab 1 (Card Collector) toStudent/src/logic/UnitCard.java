package logic;

public class UnitCard {
	private String name;
	private int bloodCost;
	private int power;
	private int health;
	private String flavorText;
	
	public UnitCard(String name, int bloodCost, int power, int health, String flavorText) {
		setName(name);
		setBloodCost(bloodCost);
		setHealth(health);
		setFlavorText(flavorText);
		setPower(power);
	}

	public int getBloodCost() {
		return bloodCost;
	}

	public void setBloodCost(int bloodCost) {
		if(bloodCost < 0) {this.bloodCost = 0;}
		else {this.bloodCost = bloodCost;}
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		if(power < 0) {this.power = 0;}
		else {this.power = power;}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health < 1) {this.health = 1;}
		else {this.health = health;}
	}

	public String getFlavorText() {
		return flavorText;
	}

	public void setFlavorText(String flavorText) {
		this.flavorText = flavorText;
	}
	
	public void setName(String name) 
	{
		if(name.isBlank()) {this.name = "Creature";}
		else {this.name = name;}
	}
	public String getName() {
		return name;
	
	}

	
	public boolean equals(UnitCard other) 
	{
		if(other.name == this.name) {return true;}
		else {return false;}
	}

	public String toString() {
		return this.getName() + " (POW: " + this.getPower() + ", HP: " + this.getHealth() + ")";
	}

}
