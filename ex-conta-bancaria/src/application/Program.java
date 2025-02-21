package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double accountBalance;
		
		System.out.printf("%nEnter account number: ");
		int accountNumber = sc.nextInt();
		System.out.printf("%nEnter account holder: ");
		sc.nextLine(); 
		String accountHolder = sc.nextLine();
		System.out.printf("%nIs there na initial deposit (y/n)? ");
		char optionDeposit = sc.next().charAt(0);
		
		Account account = null;
	
		if(optionDeposit == 'y') {
			System.out.printf("%nEnter initial deposit value: ");
			accountBalance = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, accountBalance);
		}else if(optionDeposit == 'n'){
			account = new Account(accountNumber, accountHolder);
		}
		
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.printf("%nEnter a deposit value: ");
		accountBalance = sc.nextDouble();
		account.depositValue(accountBalance);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.printf("%nEnter a withdraw value: ");
		accountBalance = sc.nextDouble();
		account.withdrawValue(accountBalance);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		sc.close();

	}

}
