package crsScoreCalculatorPackage;

public class CrsScoreCalculatorMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrsScoreCalculatorClass calculator = new CrsScoreCalculatorClass();
		int educationScore = calculator.educationScoreFinderMethod();
		int experienceScore = calculator.experienceScoreFinderMethod();
		int ageScore = calculator.ageFinderMethod();
		int ieltsScore = calculator.ieltsScoreFinderMethod();
		int adaptabilityScore = calculator.adaptabilityCheckingMethod();
		int totalCrsPoints = educationScore + experienceScore + ageScore + ieltsScore + adaptabilityScore;
		System.out.println("Total Points you have scored: " + totalCrsPoints);
		if (totalCrsPoints > 67) {
			System.out.println("You qualify to submit an Expression of Interest (EOI) to Immigration Canada");
		}
	}

}
