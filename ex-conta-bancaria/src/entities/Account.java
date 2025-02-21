package entities;

public class Account {
	private int accountNumber;
	public String accountHolder;
	private double accountBalance;
	
	public Account(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	
	public Account(int accountNumber, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void depositValue(double accountBalance) {
		this.accountBalance += accountBalance;
	}
	
	public void withdrawValue(double accountBalance) {
		this.accountBalance -= (accountBalance + 5);
	}

	public String toString() {
	    return String.format("Account %d, Holder: %s, Balance: $ %.2f", accountNumber, accountHolder, accountBalance);
	}
	
	
}
