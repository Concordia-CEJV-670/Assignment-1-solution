package com.concordia.assigment;

public class CheckingAccount extends AbstractAccount {
	private double overdraftLimit;

	public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
		super(accountNumber, accountHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public void withdrawWithOverdraft(double amount) {
		double remainingBalance = getBalance() - amount;
		if (remainingBalance >= -overdraftLimit) {
			setBalance(getBalance() - amount);
		} else {
			System.out.println("Withdrawal of $" + amount + " not allowed. Overdraft limit exceeded.");
		}
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			setBalance(getBalance() + amount);
			System.out.println("Deposit of $" + amount + " successful. New balance: $" + getBalance());
		} else {
			System.out.println("Invalid deposit amount.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= getBalance()) {
			setBalance(getBalance() - amount);
			System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + getBalance());
		} else {
			System.out.println("Invalid withdrawal amount or insufficient funds.");
		}
	}
}
