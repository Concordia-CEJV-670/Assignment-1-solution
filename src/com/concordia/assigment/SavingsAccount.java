package com.concordia.assigment;

public class SavingsAccount extends AbstractAccount {
	private double interestRate;

	public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
		super(accountNumber, accountHolder, balance);
		this.interestRate = interestRate;
	}

	public void addInterest() {
		double interest = getBalance() * interestRate;
		setBalance(getBalance() + interest);
		System.out.println("Interest of $" + interest + " added. New balance: $" + getBalance());
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
