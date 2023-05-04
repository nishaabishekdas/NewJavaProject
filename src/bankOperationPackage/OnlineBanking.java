package bankOperationPackage;

public class OnlineBanking extends BankOperations {
@Override
	void withdrawAmountFromAccount() {
		System.out.println("Enter withdraw amount:");
		float withdrawAmount = sc.nextFloat();
		if (withdrawAmount <= person.getTotalBalance(isBank) && withdrawAmount > 0
				&& withdrawAmount <= dailyLimitOfWithdraw) {
			double totalBalance = person.getTotalBalance(isBank);
			totalBalance -= withdrawAmount;
			String isFundAvailable = (person.getTotalBalance(isBank) >= minBal) ? "Transaction Successful"
					: "Account balance will go below mimimum balance.Transaction failed";
			System.out.println(isFundAvailable);
			person.setTotalBalance(isBank, totalBalance);
			System.out.println("Your current balance is:" + person.getTotalBalance(isBank));
		} else if (withdrawAmount > dailyLimitOfWithdraw) {
			System.out.println("Requested money exceeds daily limit");
		}
	}
@Override
	void depositAmountToAccount() {
		System.out.println("Enter the amount to deposit");
		float depositAmount = sc.nextFloat();
		if (depositAmount <= dailyLimitOfDeposit && depositAmount > 0) {
			double totalBalance = person.getTotalBalance(isBank);
			totalBalance += depositAmount;
			person.setTotalBalance(isBank, totalBalance);
			System.out
					.println("Amount Deposited Successfully.Your current balance is:" + person.getTotalBalance(isBank));
		} else if (depositAmount > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}
@Override
	void depositAmountToAccountUsingCheque(double accNumOfCheque, float depositAmountOfCheque) {
		if (person.getAccountNumber(isBank) == accNumOfCheque && depositAmountOfCheque <= dailyLimitOfDeposit
				&& depositAmountOfCheque > 0) {
			double totalBalance = person.getTotalBalance(isBank);
			totalBalance += depositAmountOfCheque;
			person.setTotalBalance(isBank, totalBalance);
			System.out
					.println("Amount Deposited Successfully.Your current balance is:" + person.getTotalBalance(isBank));
		} else if (depositAmountOfCheque > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}

}
