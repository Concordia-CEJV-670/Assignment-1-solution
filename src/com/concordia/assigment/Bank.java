package com.concordia.assigment;

import java.util.ArrayList;

public class Bank {
	private ArrayList<AbstractAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(AbstractAccount account) {
        accounts.add(account);
        System.out.println("Account added to the bank. Account Number: " + account.getAccountNumber());
    }

    public void closeAccount(String accountNumber) {
        for (AbstractAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accounts.remove(account);
                System.out.println("Account closed. Account Number: " + accountNumber);
                return;
            }
        }
        System.out.println("Account not found. Unable to close.");
    }

    public void displayAccounts() {
        System.out.println("Accounts in the Bank:");
        for (AbstractAccount account : accounts) {
            System.out.println("- Account Number: " + account.getAccountNumber() +
                    ", Account Holder: " + account.getAccountHolder() +
                    ", Balance: $" + account.getBalance());
        }
        System.out.println();
    }
}
