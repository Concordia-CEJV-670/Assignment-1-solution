package com.concordia.assigment;

public class BankingSystem {

	public static void main(String[] args) {
		Bank bank = new Bank();

		AbstractAccount account1 = new SavingsAccount("12345", "John Doe", 1000, 0.05);
		AbstractAccount account2 = new SavingsAccount("56789", "Jane Smith", 5000, 0.07);
		AbstractAccount account3 = new CheckingAccount("98765", "Bob Johnson", 2000, 1000);

		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);

		// Display accounts in the bank
		bank.displayAccounts();

		// Demonstrate account transactions
		account1.deposit(500);
		account2.withdraw(200);
		((CheckingAccount) account3).withdrawWithOverdraft(4100);

		// Display accounts after transactions
		bank.displayAccounts();

		// Demonstrate interest addition for savings accounts
		((SavingsAccount) account1).addInterest();
		((SavingsAccount) account2).addInterest();

		// Display accounts after adding interest
		bank.displayAccounts();

	}

}
