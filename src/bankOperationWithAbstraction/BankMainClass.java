package bankOperationWithAbstraction;

import java.util.Scanner;

public class BankMainClass {

	public static void main(String[] args) {
		PersonsAccount sucharita = new PersonsAccount(1234567890, "sucharita", 200000, 1234, "sucharita123");
		PersonsAccount neelam = new PersonsAccount(1111111111, "neelam", 30000, 5678, "neelam123");
		PersonsAccount vinduja = new PersonsAccount(222222222, "vinduja", 40000, 2222, "vinduja123");
		PersonsAccount rojy = new PersonsAccount(333333333, "rojy", 50000, 3333, "rojy123");
		PersonsAccount asha = new PersonsAccount(444444444, "asha", 60000, 4444, "asha123");
		PersonsAccount[] person = { sucharita, neelam, vinduja, rojy, asha };
		BankOperations bank = null;
		boolean isPinCorrect = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of banking service you want 1.ATM 2.Online Banking");
		int bankingService = sc.nextInt();
		switch (bankingService) {
		case 1:
			bank = new Atm();
			bank.getPersonInstances(person);
			isPinCorrect = bank.validatePin();
			break;
		case 2:
			bank = new OnlineBanking();
			bank.getPersonInstances(person);
			isPinCorrect = bank.validatePassword();
			break;
		default:
			System.out.println("Invalid Service");
			isPinCorrect = false;
			break;
		}
		if (isPinCorrect) {
			System.out.println("Which service you want\n 1.Withdraw \n 2.Deposit \n 3.View Balance \n 4.Set Balance");
			int service = sc.nextInt();
			if (service == 1) {
				bank.withdrawAmountFromAccount();
			} else if (service == 2) {
				System.out.println("How do you want to deposit money? 1.Cash 2.Cheque");
				int depositMoney = sc.nextInt();

				if (depositMoney == 1) {
					bank.depositAmountToAccountUsingCheque(1234567890, 1000);
				} else if (depositMoney == 2) {
					bank.depositAmountToAccount();
				}
			} else if (service == 3) {
				bank.viewBalance();
			} else if (service == 4) {
				bank.changePinPassword();
			} else {
				System.out.println("Invalid Service");
			}
		}
		sc.close();
	}
}
