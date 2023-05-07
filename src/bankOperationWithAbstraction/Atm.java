package bankOperationWithAbstraction;

public class Atm extends BankOperations {
	private int atmTotalAmount = 100000;
	float withdrawAmount;
	float depositAmount;

	@Override
	void withdrawAmountFromAccount() {
		System.out.println("Enter the amount to withdraw");
		withdrawAmount = sc.nextFloat();
		if (withdrawAmount <= atmTotalAmount && withdrawAmount <= dailyLimitOfWithdraw
				&& withdrawAmount <= personInstance.getTotalBalance(isBank)) {
			double totalBalance = personInstance.getTotalBalance(isBank);
			totalBalance -= withdrawAmount;
			String isFundAvailable = (totalBalance >= minBal) ? "Transaction Successful"
					: "Account balance will go below mimimum balance.Transaction failed";
			System.out.println(isFundAvailable);
			personInstance.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + personInstance.getTotalBalance(isBank));
		} else if (withdrawAmount > dailyLimitOfWithdraw) {
			System.out.println("Requested money exceeds daily limit");
		}
	}

	@Override
	void depositAmountToAccount() {
		System.out.println("Enter the amount to deposit");
		depositAmount = sc.nextFloat();
		if (depositAmount <= dailyLimitOfDeposit && depositAmount > 0) {
			double totalBalance = personInstance.getTotalBalance(isBank);
			totalBalance += depositAmount;
			personInstance.setTotalBalance(isBank, totalBalance);
			System.out.println(
					"Amount Deposited Successfully.Your current balance is:" + personInstance.getTotalBalance(isBank));
		} else if (depositAmount > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}

	@Override
	void depositAmountToAccountUsingCheque(double accNumOfCheque, float depositAmountOfCheque) {
		if (personInstance.getAccountNumber(isBank) == accNumOfCheque && depositAmountOfCheque <= dailyLimitOfDeposit
				&& depositAmountOfCheque > 0) {
			double totalBalance = personInstance.getTotalBalance(isBank);
			totalBalance += depositAmountOfCheque;
			personInstance.setTotalBalance(isBank, totalBalance);
			System.out.println(
					"Amount Deposited Successfully.Your current balance is:" + personInstance.getTotalBalance(isBank));
		} else if (depositAmountOfCheque > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}

	@Override
	public void changePinPassword() {
		boolean isPinOk = false;
		do {
			System.out.println("Enter the new PIN");
			int newPin = sc.nextInt();
			String pinNumberToString = Integer.toString(newPin);
			int pinLength = pinNumberToString.length();
			if (personInstance.getPinNumber(isBank) != newPin && !(pinLength < 4)) {
				personInstance.setPinNumber(isBank, newPin);
				System.out.println("PIN updated successfully");
				isPinOk = true;
			} else if (personInstance.getPinNumber(isBank) == newPin) {
				System.out.println("New PIN number is same as Old PIN!!");
			} else if (pinLength < 4) {
				System.out.println("Please enter a PIN with atleast 4 number");
			} else {
				System.out.println("Invalid Entry.Please try Again");
			}
		} while (isPinOk == false);
	}
}
