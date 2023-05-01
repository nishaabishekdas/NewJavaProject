package bankOperationPackage;

public class Atm extends BankOperations {
	private int atmTotalAmount = 100000;
	int withdrawAmount;
	int depositAmount;

	protected void withdraw() {
		System.out.println("Enter the amount to withdraw");
		withdrawAmount = sc.nextInt();
		if (withdrawAmount <= atmTotalAmount && withdrawAmount <= dailyLimitOfWithdraw
				&& withdrawAmount <= person.totalFundAvailable) {
			person.totalFundAvailable -= withdrawAmount;
			String isFundAvailable = (person.totalFundAvailable >= minBal) ? "Transaction Successful"
					: "Account balance will go below mimimum balance.Transaction failed";
			System.out.println(isFundAvailable);
			System.out.println("Your current balance is:" + person.totalFundAvailable);
		} else if (withdrawAmount > dailyLimitOfWithdraw) {
			System.out.println("Requested money exceeds daily limit");
		}
	}

	protected void deposit() {
		System.out.println("Enter the amount to deposit");
		depositAmount = sc.nextInt();
		if (depositAmount <= dailyLimitOfDeposit && depositAmount > 0) {
			person.totalFundAvailable += depositAmount;
			System.out.println("Your current balance is:" + person.totalFundAvailable);
		} else if (depositAmount > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}

	protected void deposit(double accNumOfCheque, int depositAmountOfCheque) {
		if (person.accountNumber == accNumOfCheque && depositAmountOfCheque <= dailyLimitOfDeposit
				&& depositAmountOfCheque > 0) {
			person.totalFundAvailable += depositAmountOfCheque;
			System.out.println("Your current balance is:" + person.totalFundAvailable);
		} else if (depositAmountOfCheque > dailyLimitOfWithdraw) {
			System.out.println("Daily Limit Exceeded");
		}
	}
}
