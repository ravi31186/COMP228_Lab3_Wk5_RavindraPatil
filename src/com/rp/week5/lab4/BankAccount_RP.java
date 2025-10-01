package com.rp.week5.lab4;

public class BankAccount_RP {
	
	private final String accountNumber;
	private double balance;
	
	public BankAccount_RP(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
