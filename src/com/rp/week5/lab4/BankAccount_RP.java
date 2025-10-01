package com.rp.week5.lab4;

public class BankAccount_RP {
	
	private final String accountNumber;
	private double balance;
	
	public BankAccount_RP(String accountNumber, double balance) {
		
		if (accountNumber == null || accountNumber.trim().isEmpty()) {
        	throw new IllegalArgumentException("Account number can not be empty");
        }
		
		if (balance <= 0.0) {
			throw new IllegalArgumentException("Blance must be greater than zero");
		}        
        
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
