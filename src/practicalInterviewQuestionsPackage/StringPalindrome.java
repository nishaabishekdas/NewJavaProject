package practicalInterviewQuestionsPackage;

import java.util.Scanner;

public class StringPalindrome {
	public String palindrome;
	String reverseString="";
	Scanner sc = new Scanner(System.in);

	public void reverseAString() {
		System.out.println("Input a string to reverse");
		palindrome = sc.next();
		for (int i = 0; i < palindrome.length(); i++) {
			char s = palindrome.charAt(i);
			reverseString += s;
		}
		System.out.println("The Reversed String is:" + reverseString);
	}

	public void checkPalindromeOrNot() {
		if (palindrome.equals(reverseString)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
