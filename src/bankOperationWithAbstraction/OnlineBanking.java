package bankOperationWithAbstraction;

public class OnlineBanking extends BankOperations {
	@Override
	void withdrawAmountFromAccount() {
		System.out.println("Enter withdraw amount:");
		float withdrawAmount = sc.nextFloat();
		if (withdrawAmount <= personInstance.getTotalBalance(isBank) && withdrawAmount > 0
				&& withdrawAmount <= dailyLimitOfWithdraw) {
			double totalBalance = personInstance.getTotalBalance(isBank);
			totalBalance -= withdrawAmount;
			String isFundAvailable = (personInstance.getTotalBalance(isBank) >= minBal) ? "Transaction Successful"
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
		float depositAmount = sc.nextFloat();
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
		boolean isPasswordOk = false;
		do {
			System.out.println("Enter the new Password");
			String accountPassword = sc.nextLine();
			int passwordLength = accountPassword.length();
			if (!(personInstance.getPassword(isBank)).equals(accountPassword) && !(passwordLength < 8)
					&& !(accountPassword.contains("&")) && !(accountPassword.contains("@"))
					&& !(accountPassword.contains("$"))) {
				personInstance.setAccountPassword(isBank, accountPassword);
				System.out.println("Password updated successfully");
				isPasswordOk = true;
			} else if ((personInstance.getPassword(isBank)).equals(accountPassword)) {
				System.out.println("New Password  is same as Old Password!!");
			} else if (passwordLength < 8 || accountPassword.contains("&") || accountPassword.contains("@")
					|| accountPassword.contains("$")) {
				System.out.println(
						"Please enter a Password with atleast 8 characters and should not contain any special Characters @,& or $.");
			}
		} while (isPasswordOk == false);

	}

}
