package rocketSimulationPackage;

import java.util.ArrayList;
import java.util.List;

public class RocketSimulationMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulation simulator = new Simulation();
		List<Item> itemArrayList = new ArrayList<Item>();
		itemArrayList = simulator.loadItem(itemArrayList);
		// Mission R1
		List<Rocket> rocketR1ArrayList = new ArrayList<Rocket>();
		rocketR1ArrayList = simulator.loadU1(itemArrayList, rocketR1ArrayList);
		double totalCostOfR1Fleet = simulator.runSimulation(rocketR1ArrayList, R1.rocketCost);
		System.out.println("Total Cost of R1 Fleet: $" + totalCostOfR1Fleet + " Million");
		// Mission R2
		List<Rocket> rocketR2ArrayList = new ArrayList<Rocket>();
		rocketR2ArrayList = simulator.loadU1(itemArrayList, rocketR2ArrayList);
		double totalCostOfR2Fleet = simulator.runSimulation(rocketR2ArrayList, R2.rocketCost);
		System.out.println("Total Cost of R2 Fleet: $" + totalCostOfR2Fleet + " Million");
	}
}
