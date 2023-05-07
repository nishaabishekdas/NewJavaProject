package bankOperationWithAbstraction;

import java.util.Scanner;

public abstract class BankOperations {
	int minBal = 500;
	int dailyLimitOfWithdraw = 1500;
	int dailyLimitOfDeposit = 1500;
	boolean isBank = true;
	PersonsAccount[] person = new PersonsAccount[10];
	PersonsAccount personInstance;
	Scanner sc = new Scanner(System.in);

	public void getPersonInstances(PersonsAccount[] person) {
		for (int i = 0; i < person.length; i++) {
			if (this.person[i] == null) {
				this.person[i] = person[i];
			}
		}
	}

	public abstract void changePinPassword();

	void withdrawAmountFromAccount() {
		System.out.println("Enter the amount to withdraw");
		float withdrawAmount = sc.nextFloat();
		if (withdrawAmount > 0 && withdrawAmount <= personInstance.getTotalBalance(isBank)) {
			double totalBalance = personInstance.getTotalBalance(isBank);
			totalBalance -= withdrawAmount;
			String isFundAvailable = (personInstance.getTotalBalance(isBank) >= minBal) ? "Transaction Successful"
					: "Account balance will go below mimimum balance.Transaction failed";
			System.out.println(isFundAvailable);
			personInstance.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + personInstance.getTotalBalance(isBank));
		}
	}

	void withdrawAmountFromAccountUsingCheque(double accNumOfCheque, float withdrawAmountOfCheque) {
		if (personInstance.getAccountNumber(isBank) == accNumOfCheque) {
			double totalBalance = personInstance.getTotalBalance(isBank);
			totalBalance -= withdrawAmountOfCheque;
			personInstance.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + personInstance.getTotalBalance(isBank));
		}
	}

	void depositAmountToAccount() {
		System.out.println("Enter the amount to deposit");
		float depositAmount = sc.nextFloat();
		double totalBalance = personInstance.getTotalBalance(isBank);
		totalBalance += depositAmount;
		personInstance.setTotalBalance(isBank, totalBalance);
		System.out.println("Your current balance is:" + personInstance.getTotalBalance(isBank));
	}

	void depositAmountToAccountUsingCheque(double accNumOfCheque, float depositAmountOfCheque) {
		if (personInstance.getAccountNumber(isBank) == accNumOfCheque) {
			double totalBalance = personInstance.getTotalBalance(isBank);
			totalBalance += depositAmountOfCheque;
			personInstance.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + personInstance.getTotalBalance(isBank));
		}
	}

	void viewBalance() {
		System.out.println("Total Balance Available is:" + personInstance.getTotalBalance(isBank));
	}

	boolean validatePin() {
		boolean isPinCorrect = false;
		int count = 2;

		for (int j = 0; j < 3; j++) {
			System.out.println("Enter your PIN Number:");
			int enteredPin = sc.nextInt();
			for (int i = 0; i < person.length; i++) {
				if (person[i] != null && enteredPin == person[i].getPinNumber(isBank)) {
					personInstance = person[i];
					isPinCorrect = true;
					break;
				} else if (person[i] == null) {
					break;
				}
			}
			if (!isPinCorrect && count != 0) {
				System.out.println("PIN validation failed!Try Again");
				count--;
			} else if (count == 0) {
				System.out.println("Your Card is blocked.Please contact your bank!");
			} else {
				break;
			}
		}
		return isPinCorrect;
	}

	boolean validatePassword() {
		boolean isPassword = false;
		int count = 2;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter your Password");
			String accountPassword = sc.nextLine();
			for (int j = 0; j < person.length; j++) {
				if (person[j] != null && accountPassword.equals(person[j].getPassword(isBank))) {
					personInstance = person[j];
					isPassword = true;
					break;
				} else if (person[j] == null) {
					break;
				}
			}
			if (!isPassword && count != 0) {
				System.out.println("Password is incorrect.Try again!!");
				count--;
			} else if (count == 0) {
				System.out.println("Your account is blocked");
			} else {
				break;
			}
		}
		return isPassword;
	}

}
