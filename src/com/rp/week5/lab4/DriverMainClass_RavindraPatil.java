package com.rp.week5.lab4;

import java.util.Scanner;

public class DriverMainClass_RavindraPatil {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Initial Balance ");
		double initialBalance = scan.nextDouble();
		SavingsAccount_RP s1 = new SavingsAccount_RP("123456", initialBalance);
		
		System.out.println("Enter Deposit Amount ");
		double depositAmount = scan.nextDouble();
		s1.deposit(depositAmount);
		
		System.out.println("New Balance After Deposit => " + s1.getBalance());
		
				
		System.out.println("Enter Withdraw Amount ");
		double withdrawalAmount = scan.nextDouble();
		s1.withdraw(withdrawalAmount);
		
		System.out.println("New Balance After withdraw => " + s1.getBalance());
		
				
		System.out.println("Enter Withdraw Amount ");
		double withdrawalAmount1 = scan.nextDouble();
		s1.withdraw(withdrawalAmount1);
		
		System.out.println("New Balance After withdraw => " + s1.getBalance());
		
		scan.close();

	}

}
