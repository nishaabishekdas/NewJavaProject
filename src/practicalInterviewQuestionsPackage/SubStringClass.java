package practicalInterviewQuestionsPackage;

import java.util.Scanner;

public class SubStringClass {
	public String enteredString;
	public String subString;
	Scanner sc = new Scanner(System.in);

	public void getSubString() {
		boolean isFound = false;
		System.out.println("Enter the String");
		enteredString = sc.next();
		System.out.println("Enter the substring");
		subString = sc.next();
		for (int i = 0; i < enteredString.length()-subString.length(); i++) {
			int j;
			if (enteredString.charAt(i) == subString.charAt(0)) {
				for (j = 0; j < subString.length(); j++) {
					if (enteredString.charAt(i + j) != subString.charAt(j)) {
						break;
					}
				}
				if (j == subString.length()) {
					isFound = true;
					break;
				}
			}
		}
		if (isFound) {
			System.out.println("Substring is found");
		} else {
			System.out.println("Substring is not found");
		}
	}
}
