package bankOperationPackage;

public class OnlineBanking extends BankOperations {
	void withdrawAmountFromAccount() {
		System.out.println("Enter withdraw amount:");
		float withdrawAmount = sc.nextFloat();
		if (withdrawAmount <= person.totalFundAvailable && withdrawAmount > 0
				&& withdrawAmount <= dailyLimitOfWithdraw) {
			person.totalFundAvailable -= withdrawAmount;
			String isFundAvailable = (person.totalFundAvailable >= minBal) ? "Transaction Successful"
					: "Account balance will go below mimimum balance.Transaction failed";
			System.out.println(isFundAvailable);
			System.out.println("Your current balance is:" + person.totalFundAvailable);
		} else if (withdrawAmount > dailyLimitOfWithdraw) {
			System.out.println("Requested money exceeds daily limit");
		}
	}

	void depositAmountToAccount() {
		System.out.println("Enter the amount to deposit");
		float depositAmount = sc.nextFloat();
		if (depositAmount <= dailyLimitOfDeposit && depositAmount > 0) {
			person.totalFundAvailable += depositAmount;
			System.out.println("Amount Deposited Successfully.Your current balance is:" + person.totalFundAvailable);
		} else if (depositAmount > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}

	void depositAmountToAccountUsingCheque(double accNumOfCheque, float depositAmountOfCheque) {
		if (person.accountNumber == accNumOfCheque && depositAmountOfCheque <= dailyLimitOfDeposit
				&& depositAmountOfCheque > 0) {
			person.totalFundAvailable += depositAmountOfCheque;
			System.out.println("Amount Deposited Successfully.Your current balance is:" + person.totalFundAvailable);
		} else if (depositAmountOfCheque > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}

}
