package crsScoreCalculatorPackage;

import java.util.Scanner;

public class CrsScoreCalculatorClass {
	String[] education = { "PhD", "Master's Degree",
			"Two or more university degrees/diplomas at the bachelor’s level one of which is a three year or longer duration",
			"12th+ Three Years or longer Degree /Diploma" };
	int[] educationPoints = { 25, 23, 22, 21 };
	String[] experience = { "4-5 years", "6 years or more" };
	int[] experiencePoints = { 13, 15 };
	int[] age = new int[30];
	int[] agePoints = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
	String[] ieltsModules = { "LISTENING", "SPEAKING", "READING", "WRITING" };
	int[] ieltsScores = { 6, 5 };
	int[] adaptabilityPoints = { 5, 10 };
	Scanner sc = new Scanner(System.in);

	int educationScoreFinderMethod() {
		int educationScore = 0;
		System.out.println("Enter your Education Level: ");
		String educationLevel = sc.nextLine();
		for (int i = 0; i < education.length; i++) {
			if (educationLevel.equals(education[i])) {
				System.out.println("Mark scored based on Education Criteria is: " + educationPoints[i]);
				educationScore = educationPoints[i];
				break;
			}
		}
		return educationScore;
	}

	int experienceScoreFinderMethod() {
		int experienceScore = 0;
		String userExperience = null;
		System.out.println("Enter your Experience in years:");
		float experienceLevel = sc.nextFloat();
		if (experienceLevel >= 4 && experienceLevel <= 5) {
			userExperience = "4-5 years";
		} else if (experienceLevel >= 6) {
			userExperience = "6 years or more";
		}

		for (int i = 0; i < experience.length; i++) {
			if (experience[i].equals(userExperience)) {
				System.out.println("Mark scored based on Experience Criteria is: " + experiencePoints[i]);
				experienceScore = experiencePoints[i];
				break;
			}
		}
		return experienceScore;
	}

	int ageFinderMethod() {
		int ageScore = 0;
		int minAge = 18;
		int count = 0;
		System.out.println("Enter your age in years:");
		int ageLevel = sc.nextInt();
		for (int i = 0; i < age.length; i++) {
			age[i] = minAge;
			minAge++;
		}

		for (int j = 0; j < age.length; j++) {
			if (age[j] >= 18 && age[j] <= 35 && age[j] == ageLevel) {
				System.out.println("Mark scored based on Age Criteria is:" + agePoints[count]);
				ageScore = agePoints[count];
				break;
			} else if (age[j] >= 36 && age[j] <= 47 && age[j] == ageLevel) {
				int agePointCount = age.length - j;
				int s = agePoints.length;
				count = s - agePointCount;
				System.out.println("Mark scored based on Age Criteria is:" + agePoints[count]);
				ageScore = agePoints[count];
				break;
			}
		}
		return ageScore;

	}

	int ieltsScoreFinderMethod() {
		int ieltsScoreListening = 0;
		int ieltsScoreSpeaking = 0;
		int ieltsScoreReading = 0;
		int ieltsScoreWriting = 0;
		int ieltsTotalScore = 0;
		for (int i = 0; i < ieltsModules.length; i++) {
			if (ieltsModules[i].equals("LISTENING")) {
				System.out.println("Enter your IELTS Score for Listening:");
				float listeningScore = sc.nextFloat();
				if (listeningScore >= 8) {
					System.out.println("Mark scored on Listening is:" + ieltsScores[i]);
					ieltsScoreListening = ieltsScores[i];
				} else if (listeningScore == 7.5) {
					System.out.println("Mark scored on Listening is:" + ieltsScores[i + 1]);
					ieltsScoreListening = ieltsScores[i + 1];
				} else {
					System.out.println("no points");
				}
			} else if (ieltsModules[i].equals("SPEAKING")) {
				System.out.println("Enter your IELTS Score for Speaking:");
				float speakingScore = sc.nextFloat();
				if (speakingScore >= 7) {
					System.out.println("Score for Speaking is" + ieltsScores[i - 1]);
					ieltsScoreSpeaking = ieltsScores[i - 1];
				} else if (speakingScore == 6.5) {
					System.out.println("Score for Speaking is" + ieltsScores[i]);
					ieltsScoreSpeaking = ieltsScores[i];
				}
			} else if (ieltsModules[i].equals("READING")) {
				System.out.println("Enter your IELTS Score for Reading:");
				float readingScore = sc.nextFloat();
				if (readingScore >= 7) {
					System.out.println("Score for reading is" + ieltsScores[i - 2]);
					ieltsScoreReading = ieltsScores[i - 2];
				} else if (readingScore == 6.5) {
					System.out.println("Score for reading is" + ieltsScores[i - 1]);
					ieltsScoreReading = ieltsScores[i - 1];
				}
			} else if (ieltsModules[i].equals("WRITING")) {
				System.out.println("Enter your IELTS Score for Writing:");
				float writingScore = sc.nextFloat();
				if (writingScore >= 7) {
					System.out.println("Score for Writing is" + ieltsScores[i - 3]);
					ieltsScoreWriting = ieltsScores[i - 3];
				} else if (writingScore == 6.5) {
					System.out.println("Score for Writing is" + ieltsScores[i - 2]);
					ieltsScoreWriting = ieltsScores[i - 2];
				}
			}

		}
		ieltsTotalScore = ieltsScoreListening + ieltsScoreSpeaking + ieltsScoreReading + ieltsScoreWriting;
		return ieltsTotalScore;
	}

	int adaptabilityCheckingMethod() {
		int relativeScore = 0;
		int studyScore = 0;
		int workScore = 0;
		int totalAdaptability = 0;
		System.out.println(
				"If you have a relative  in Canada(Parents, Grand Parents, Brother, Sister, Aunt, Uncle, Nephew or Niece) who is a Canadian Citizen or PR holder (Y/N)");
		boolean isRelative = sc.nextBoolean();
		if (isRelative) {
			System.out.println("Score for Relative in Canada:" + adaptabilityPoints[0]);
			relativeScore = adaptabilityPoints[0];
		}
		System.out.println("Have you studied in Canada for atleast 2 years (Y/N)");
		boolean isStudied = sc.nextBoolean();
		if (isStudied) {
			System.out.println("Score for Studies in Canada:" + adaptabilityPoints[0]);
			studyScore = adaptabilityPoints[0];
		}
		System.out.println("Have you worked in Canada for atleast 2 years at NOC 0, A, B (Y/N)");
		boolean isWorked = sc.nextBoolean();
		if (isWorked) {
			System.out.println("Score for Work in Canada:" + adaptabilityPoints[1]);
			workScore = adaptabilityPoints[1];
		}
		totalAdaptability = relativeScore + studyScore + workScore;
		return totalAdaptability;
	}

}
