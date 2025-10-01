package com.rp.week5.lab4;

import java.util.Scanner;

public class DriverMainClass_RavindraPatil {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your account number ");
		String accountNumber = scan.nextLine();
		
		System.out.println("Enter Initial Balance ");
		double initialBalance = scan.nextDouble();
		
		SavingsAccount_RP savingAcct = new SavingsAccount_RP(accountNumber, initialBalance);
		
		System.out.println("Enter Deposit Amount ");
		double depositAmount = scan.nextDouble();
		savingAcct.deposit(depositAmount);
		
		System.out.println("New Balance After Deposit => " + savingAcct.getBalance());
		
				
		System.out.println("Enter Withdraw Amount ");
		double withdrawalAmount = scan.nextDouble();
		savingAcct.withdraw(withdrawalAmount);
		
		System.out.println("New Balance After withdraw => " + savingAcct.getBalance());
		
				
		while(true) {
			System.out.println("Enter Withdraw Amount ");
			double withdrawalAmount1 = scan.nextDouble();
			if (withdrawalAmount1 > savingAcct.getBalance()) {
				System.out.println("Insufficient balance! Try again.");
                continue; 
			} else {
				savingAcct.withdraw(withdrawalAmount1);
                break;
			}
		}
		
		System.out.println("New Balance After withdraw => " + savingAcct.getBalance());
		
		scan.close();

	}

}
