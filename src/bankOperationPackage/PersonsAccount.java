package bankOperationPackage;

public class PersonsAccount {
	double accountNumber;
	String accountHolderName;
	double totalFundAvailable;
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
}
