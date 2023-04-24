package guessTheStudentProjectPackage;

import java.util.Scanner;

public class GuessTheStudentGameClass {
	public String[] studentName = { "Aleena", "Angel", "Asha", "Clemin", "Gopesh", "Hamneet", "Jimna", "Jobin", "Jude",
			"Kamaldeep", "Manpreetk", "Manpreets", "Mariya", "Namitha", "Neelam", "Nisha", "Parminder", "Rajat", "Rojy",
			"Sojan", "Sucharitha", "Vindhuja" };
	public int[] randomNumberArray = { 12, 7, 1, 15, 22, 11, 3, 17, 4, 21, 5, 19, 6, 20, 14, 8, 18, 9, 16, 10, 13, 2 };
	char[] wrongLetterArray = new char[10];
	Scanner sc = new Scanner(System.in);

	void getRandomStudentName() {

		for (int i = 0; i < randomNumberArray.length; i++) {
			int index = randomNumberArray[i];
			int lengthOfNamePicked = studentName[index].length();
			setUnderscoreAsInitialOutput(lengthOfNamePicked, studentName[index]);
		}
	}

	void setUnderscoreAsInitialOutput(int lengthOfNamePicked, String studentNameFromArray) {
		char[] asterisk = new char[lengthOfNamePicked];
		System.out.print("you are guessing:");
		for (int j = 0; j < lengthOfNamePicked; j++) {
			asterisk[j] = '*';
			System.out.print(asterisk[j]);
		}
		getGuessedLetters(lengthOfNamePicked, studentNameFromArray, asterisk);
	}

	void getGuessedLetters(int lengthOfNamePicked, String studentNameFromArray, char[] asterisk) {
		int wrongLetterCount = 0;
		for (int i = 0; i < lengthOfNamePicked + 5; i++) {
			System.out.print("\nGuess a Letter:");
			char guessLetter = sc.next().charAt(0);
			char guessLetterToLower = Character.toLowerCase(guessLetter);
			for (int count = 0; count < lengthOfNamePicked; count++) {
				char studentNameChar = studentNameFromArray.charAt(count);
				char studentNameToLower = Character.toLowerCase(studentNameChar);
				if (guessLetterToLower == studentNameToLower) {
					for (int s = 0; s < asterisk.length; s++) {
						studentNameChar = studentNameFromArray.charAt(s);
						studentNameToLower = Character.toLowerCase(studentNameChar);
						if (guessLetterToLower == studentNameToLower) {
							asterisk[s] = studentNameChar;
						}
					}
				}
			}
			printArrayValues(asterisk);
			wrongLetterCount = getWrongNumberArrayValues(guessLetterToLower, studentNameFromArray, wrongLetterCount);
			boolean isWon = getFinalResultOfGame(asterisk, lengthOfNamePicked);
			if (wrongLetterCount == 5) {
				System.out.println("\n YOU LOST!!!");
				break;
			} else if (isWon) {
				System.out.println("\n YOU WON!!");
				break;
			}

		}

	}

	void printArrayValues(char[] passingArrayName) {
		System.out.print("you are guessing:");
		for (int i = 0; i < passingArrayName.length; i++) {
			System.out.print(passingArrayName[i]);
		}
	}

	int getWrongNumberArrayValues(char guessLetter, String studentNameFromArray, int wrongLetterCount) {
		boolean isWrongGuess = false;

		for (int i = 0; i < studentNameFromArray.length(); i++) {
			char compareArrayChar = studentNameFromArray.charAt(i);
			char compareArrayCharToLower = Character.toLowerCase(compareArrayChar);
			if (guessLetter != compareArrayCharToLower) {
				isWrongGuess = true;
			} else {
				isWrongGuess = false;
				System.out.print("\nYou have guessed " + wrongLetterCount + " wrong letter: ");
				break;
			}
		}
		if (isWrongGuess) {
			wrongLetterArray[wrongLetterCount] = guessLetter;
			wrongLetterCount++;
			System.out.print("\nYou have guessed " + wrongLetterCount + " wrong letter: ");
		}
		for (int j = 0; j < wrongLetterCount; j++) {
			System.out.print(" " + wrongLetterArray[j]);
		}
		return wrongLetterCount;

	}

	boolean getFinalResultOfGame(char[] asterisk, int lengthOfNamePicked) {
		int count = 0;
		boolean isWon = false;
		for (int i = 0; i < asterisk.length; i++) {
			if (asterisk[i] != '*') {
				count++;
			}
		}
		if (count == lengthOfNamePicked) {
			isWon = true;
		} else {
			count = 1;
		}
		return isWon;
	}
}
