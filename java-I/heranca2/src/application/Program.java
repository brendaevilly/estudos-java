package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingdAccount;

public class Program {

	public static void main(String[] args) {
		
		/* 
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.00);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Brenda", 0.0, 1000.00);
		Account acc3 = new SavingdAccount(1004, "Merces", 0.0, 0.02);
		
		// DOWNCASTING
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.loan(500.00);
		
		// businessAcount acc5 = (businessAcount)acc3;
		if (acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingdAccount) {
			SavingdAccount acc5 = (SavingdAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		*/
		
		
		Account acc6 = new Account(2001, "Pedro", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingdAccount(2002, "Kevin", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc3 = new BusinessAcount(2003, "Ana", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
	}

}
