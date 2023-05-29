package rocketSimulationPackage;

public class Rocket implements SpaceShip {
	float totalCargoLoaded;
	public float currentRocketWeightWithCargo;

	@Override
	public boolean launch() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(Item item) {
		if (totalCargoLoaded + item.getWeight() <= R1.maxWeightOfRocketWithCargo - R1.rocketWeightOfR1) {
			return true;
		}
		return false;
	}

	@Override
	public void carry(Item item) {
		totalCargoLoaded += item.getWeight();
		currentRocketWeightWithCargo = totalCargoLoaded;
	}

}
