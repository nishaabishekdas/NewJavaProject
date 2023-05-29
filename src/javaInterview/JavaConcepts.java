package javaInterview;

import java.util.Scanner;

public class JavaConcepts {
	public String enteredString;

	Scanner sc = new Scanner(System.in);

	public void checkStringContainsUniqueCharacter() {
		boolean isUnique = false;
		System.out.println("Enter the string");
		enteredString = sc.next();
		char[] inputString = enteredString.toCharArray();
		for (int i = 0; i < inputString.length; i++) {
			for (int j = i+1; j < inputString.length; j++) {
				if (inputString[i] == inputString[j]) {
					isUnique = false;
					break;
				} else {
					isUnique = true;

				}		
			}
			if(isUnique==false) {
				break;
			}
		}
		if (isUnique) {
			System.out.println("String is Unique");
		} else {
			System.out.println("String is not unique");
		}
	}
}
