package application;

import entities.Account;
import entities.SavingdAccount;

public class Program {

	public static void main(String[] args) {
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingdAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
