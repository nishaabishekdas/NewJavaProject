package bankOperationPackage;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		//PersonsAccount person = new PersonsAccount(1234567890, "Nisha", 20000, 3246, "Nisha@123");
		BankOperations bank = null;
		boolean isPinCorrect = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of banking service you want 1.ATM 2.Online Banking");
		String bankingService = sc.nextLine();
		switch (bankingService) {
		case "ATM":
			bank = new Atm();
			isPinCorrect = bank.validatePin();
			break;
		case "Online Banking":
			bank = new OnlineBanking();
			isPinCorrect = bank.validatePassword();
			break;
		default:
			System.out.println("Invalid Service");
			isPinCorrect = false;
			break;
		}
		if (isPinCorrect) {
			System.out.println("Which service you want\n 1.Withdraw \n 2.Deposit \n 3.View Balance");
			String service = sc.nextLine();
			if (service.equals("Withdraw")) {
				bank.withdrawAmountFromAccount();
			} else if (service.equals("Deposit")) {
				System.out.println("How do you want to deposit money? 1.Cash 2.Cheque");
				String depositMoney = sc.nextLine();

				if (depositMoney.equals("Cheque")) {
					bank.depositAmountToAccountUsingCheque(1234567890, 1000);
				} else if (depositMoney.equals("Cash")) {
					bank.depositAmountToAccount();
				}
			} else if (service.equals("View Balance")) {
				bank.viewBalance();
			} else {
				System.out.println("Invalid Service");
			}
		}
		sc.close();
	}
}
