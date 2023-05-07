package bankOperationWithAbstraction;

public class PersonsAccount {
	private double accountNumber;
	private String accountHolderName;
	private double totalFundAvailable;
	private int pinNumber;
	private String accountPassword;

	PersonsAccount(double accountNumber, String accountHolderName, double totalFundAvailable, int pinNumber,
			String accountPassword) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.totalFundAvailable = totalFundAvailable;
		this.pinNumber = pinNumber;
		this.accountPassword = accountPassword;
	}

	int getPinNumber(boolean isBank) {
		if (isBank) {
			return pinNumber;
		}
		return 0;
	}

	String getPassword(boolean isBank) {
		if (isBank) {
			return accountPassword;
		}
		return null;
	}

	String getAccountHolderName(boolean isBank) {
		if (isBank) {
			return accountHolderName;
		}
		return null;
	}

	double getAccountNumber(boolean isBank) {
		if (isBank) {
			return accountNumber;
		}
		return 0;
	}

	double getTotalBalance(boolean isBank) {
		if (isBank) {
			return totalFundAvailable;
		}
		return 0;
	}

	void setTotalBalance(boolean isBank, double balance) {
		if (isBank) {
			totalFundAvailable = balance;
		} else {
			System.out.println("Cannot update value");
		}
	}

	public void setPinNumber(boolean isBank, int pinNumber) {
		if (isBank) {
			this.pinNumber = pinNumber;
		} else {
			System.out.println("Cannot update PIN");
		}
	}

	public void setAccountPassword(boolean isBank, String accountPassword) {
		if (isBank) {
			this.accountPassword = accountPassword;
		} else {
			System.out.println("Cannot update PIN");
		}
	}

}
