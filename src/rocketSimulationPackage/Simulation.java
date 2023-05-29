package rocketSimulationPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Simulation {
	
	public List<Item> loadItem(List<Item> itemArrayList) {
		String lineReaded;
		try (BufferedReader br = new BufferedReader(new FileReader("src/rocketSimulationPackage/Phase-1.txt"))) {
			while ((lineReaded = br.readLine()) != null) {
				String[] seperatedString = lineReaded.split("=");
				Item itemObj = new Item();
				for (int i = 0; i < seperatedString.length; i = i + 2) {
					itemObj.setName(seperatedString[i]);
					int loadKg = Integer.parseInt(seperatedString[i + 1]);
					itemObj.setWeight(loadKg);
					itemArrayList.add(itemObj);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return itemArrayList;
	}

	public List<Rocket> loadU1(List<Item> itemArrayList, List<Rocket> rocketR1ArrayList) {
		boolean isCarry = false;
		int currentIndex = 0;
		Rocket rocketR1 = new R1();
		for (int i = 0; i < itemArrayList.size(); i++) {
			isCarry = rocketR1.canCarry(itemArrayList.get(i));
			if (!isCarry) {
				rocketR1ArrayList.add(rocketR1);
				R1 castRocketR1 = (R1) rocketR1;
				castRocketR1.cargoCarried = castRocketR1.currentRocketWeightWithCargo;
				// System.out.println(castRocketR1.cargoCarried);
				rocketR1 = new R1();
				i = currentIndex - 1;
			} else {
				rocketR1.carry(itemArrayList.get(i));
				currentIndex++;
			}
		}
		if (currentIndex == itemArrayList.size()) {
			rocketR1ArrayList.add(rocketR1);
			R1 castRocketR1 = (R1) rocketR1;
			castRocketR1.cargoCarried = castRocketR1.currentRocketWeightWithCargo;
			// System.out.println(castRocketR1.cargoCarried);
		}
		return rocketR1ArrayList;
	}

	public List<Rocket> loadU2(List<Item> itemArrayList, List<Rocket> rocketR2ArrayList) {
		boolean isCarry = false;
		int currentIndex = 0;
		Rocket rocketR2 = new R2();
		for (int i = 0; i < itemArrayList.size(); i++) {
			isCarry = rocketR2.canCarry(itemArrayList.get(i));
			if (!isCarry) {
				rocketR2ArrayList.add(rocketR2);
				R2 castRocketR2 = (R2) rocketR2;
				castRocketR2.cargoCarried = castRocketR2.currentRocketWeightWithCargo;
				// System.out.println(castRocketR1.cargoCarried);
				rocketR2 = new R2();
				i = currentIndex - 1;
			} else {
				rocketR2.carry(itemArrayList.get(i));
				currentIndex++;
			}
		}
		if (currentIndex == itemArrayList.size()) {
			rocketR2ArrayList.add(rocketR2);
			R2 castRocketR2 = (R2) rocketR2;
			castRocketR2.cargoCarried = castRocketR2.currentRocketWeightWithCargo;
			// System.out.println(castRocketR1.cargoCarried);
		}
		return rocketR2ArrayList;
	}

	public double runSimulation(List<Rocket> rocketArrayList, double rocketCost) {

		double totalFleetCost = 0, costOfEachRocket = 0;
		for (Rocket rocket : rocketArrayList) {
			boolean isLaunchSuccess = false;
			boolean isLandSuccess = false;
			while (isLaunchSuccess != true || isLandSuccess != true) {
				costOfEachRocket += rocketCost;
				isLaunchSuccess = rocket.launch() ? true : false;
				isLandSuccess = rocket.land() ? true : false;
			}
			totalFleetCost += costOfEachRocket;
		}
		return (totalFleetCost);
	}
}
