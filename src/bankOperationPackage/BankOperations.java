package bankOperationPackage;

import java.util.Scanner;

public class BankOperations {
	int minBal = 500;
	int dailyLimitOfWithdraw = 1500;
	int dailyLimitOfDeposit = 1500;
	boolean isBank = true;
	PersonsAccount person = new PersonsAccount(1234567890, "Nisha", 20000, 3246, "Nisha@123");
	Scanner sc = new Scanner(System.in);

	boolean validatePin() {
		boolean isPinCorrect = false;
		int count = 2;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your PIN Number:");
			int enteredPin = sc.nextInt();
			if (enteredPin == person.getPinNumber(isBank)) {
				isPinCorrect = true;
				break;
			} else if (enteredPin != person.getPinNumber(isBank) && count != 0) {
				System.out.println("PIN validation failed!Try Again");
				count--;
				isPinCorrect = false;
			} else if (count == 0) {
				System.out.println("Your Card is blocked.Please contact your bank!");
				isPinCorrect = false;
			}
		}
		return isPinCorrect;
	}

	void withdrawAmountFromAccount() {
		System.out.println("Enter the amount to withdraw");
		float withdrawAmount = sc.nextFloat();
		if (withdrawAmount > 0 && withdrawAmount <= person.getTotalBalance(isBank)) {
			double totalBalance = person.getTotalBalance(isBank);
			totalBalance -= withdrawAmount;
			String isFundAvailable = (person.getTotalBalance(isBank) >= minBal) ? "Transaction Successful"
					: "Account balance will go below mimimum balance.Transaction failed";
			System.out.println(isFundAvailable);
			person.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + person.getTotalBalance(isBank));
		}
	}

	void withdrawAmountFromAccountUsingCheque(double accNumOfCheque, float withdrawAmountOfCheque) {
		if (person.getAccountNumber(isBank) == accNumOfCheque) {
			double totalBalance = person.getTotalBalance(isBank);
			totalBalance -= withdrawAmountOfCheque;
			person.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + person.getTotalBalance(isBank));
		}
	}

	void depositAmountToAccount() {
		System.out.println("Enter the amount to deposit");
		float depositAmount = sc.nextFloat();
		double totalBalance = person.getTotalBalance(isBank);
		totalBalance += depositAmount;
		person.setTotalBalance(isBank, totalBalance);
		System.out.println("Your current balance is:" + person.getTotalBalance(isBank));
	}

	void depositAmountToAccountUsingCheque(double accNumOfCheque, float depositAmountOfCheque) {
		if (person.getAccountNumber(isBank) == accNumOfCheque) {
			double totalBalance = person.getTotalBalance(isBank);
			totalBalance += depositAmountOfCheque;
			person.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + person.getTotalBalance(isBank));
		}
	}

	void viewBalance() {
		double totalBalance = person.getTotalBalance(isBank);
		person.setTotalBalance(isBank, totalBalance);
		System.out.println("Total Balance Available is:" + person.getTotalBalance(isBank));
	}

	boolean validatePassword() {
		int count = 2;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your Password");
			String accountPassword = sc.nextLine();
			String userPassword = person.getPassword(isBank);
			if (accountPassword.equals(userPassword)) {
				return true;

			} else if (!accountPassword.equals(userPassword) && count != 0) {
				System.out.println("Password is incorrect.Try again!!");
				count--;
			} else {
				System.out.println("Your account is blocked");
			}
		}
		return false;
	}
}
