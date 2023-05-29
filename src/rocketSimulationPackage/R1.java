package rocketSimulationPackage;

import java.util.Random;

public class R1 extends Rocket {
	public static double rocketCost = 100;
	public static final double rocketWeightOfR1 = 10000;
	public static final double maxWeightOfRocketWithCargo = 18000;
	public double cargoCarried;
	public double chanceOfLaunchExplosion;
	public double chanceOfLandCrash;

	@Override
	public boolean launch() {
		double cargoLimit = maxWeightOfRocketWithCargo - rocketCost;
		chanceOfLaunchExplosion = 0.05 * cargoCarried / cargoLimit;
		double chanceOfLaunchSuccess = 1 - chanceOfLaunchExplosion;
		Random random = new Random();
		double randomNumber = random.nextDouble() * 3;
		boolean successOrFailure = randomNumber < chanceOfLaunchSuccess ? true : false;
		return successOrFailure;
	}

	@Override
	public boolean land() {
		double cargoLimit = maxWeightOfRocketWithCargo - rocketCost;
		chanceOfLandCrash = .01 * cargoCarried / cargoLimit;
		double chanceOfLandSuccess = 1 - chanceOfLandCrash;
		Random random = new Random();
		double randomNumber = random.nextDouble() * 2;
		boolean successOrFailure = randomNumber < chanceOfLandSuccess ? true : false;
		return successOrFailure;
	}
}
