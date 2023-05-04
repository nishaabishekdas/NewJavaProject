package learningCompositionPackage;

public class PersonDetailsClass {
	private double accountNumber;
	private String personName;
	private String branchName;
	private double fundAvailable;
	private boolean isMarried;

	public PersonDetailsClass(double accountNumber, String personName, String branchName, double fundAvailable,
			boolean isMarried) {
		this.accountNumber = accountNumber;
		this.personName = personName;
		this.branchName = branchName;
		this.fundAvailable = fundAvailable;
		this.isMarried = isMarried;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public String getPersonName() {
		return personName;
	}

	public String getBranchName() {
		return branchName;
	}

	public double getFundAvailable() {
		return fundAvailable;
	}

	public boolean getMarriageStatus() {
		return isMarried;
	}
}
