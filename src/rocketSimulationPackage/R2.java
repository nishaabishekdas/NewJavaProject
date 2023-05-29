package rocketSimulationPackage;

import java.util.Random;

public class R2 extends Rocket {
	public static double rocketCost = 120;
	public static final double rocketWeightOfR2 = 18000;
	public static final double maxWeightOfRocketWithCargo = 29000;
	public double cargoCarried;
	public double chanceOfLaunchExplosion;
	public double chanceOfLandCrash;

	@Override
	public boolean launch() {
		double cargoLimit = maxWeightOfRocketWithCargo - rocketCost;
		chanceOfLaunchExplosion = 0.04 * cargoCarried / cargoLimit;
		double chanceOfLaunchSuccess = 1 - chanceOfLaunchExplosion;
		Random random = new Random();
		double randomNumber = random.nextDouble() * 2;
		boolean successOrFailure = randomNumber < chanceOfLaunchSuccess ? true : false;
		return successOrFailure;
	}

	@Override
	public boolean land() {
		double cargoLimit = maxWeightOfRocketWithCargo - rocketCost;
		chanceOfLandCrash = .08 * cargoCarried / cargoLimit;
		double chanceOfLandSuccess = 1 - chanceOfLandCrash;
		Random random = new Random();
		double randomNumber = random.nextDouble() * 3;
		boolean successOrFailure = randomNumber < chanceOfLandSuccess ? true : false;
		return successOrFailure;
	}
}
