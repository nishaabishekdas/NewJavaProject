package practicalInterviewQuestionsPackage;

import java.util.Scanner;

public class PrimeNumber {
	public int primeNumber;
	Scanner sc = new Scanner(System.in);

	public void getPrimeNumber() {
		boolean istrue = false;
		System.out.println("Enter a number");
		primeNumber = sc.nextInt();
		for (int i = 2; i < primeNumber; i++) {
			int number = primeNumber % i;
			if (number == 0) {
				istrue = true;
			}
		}
		if (istrue) {
			System.out.println("Not a Prime");
		} else {
			System.out.println("Prime number");
		}
	}
}
