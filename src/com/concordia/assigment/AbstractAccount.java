package com.concordia.assigment;

public abstract class AbstractAccount {
	private String accountNumber;
	private String accountHolder;
	private double balance;

	public AbstractAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public String getAccountHolder() {
		return this.accountHolder;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
