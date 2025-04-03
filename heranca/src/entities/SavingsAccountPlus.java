package entities;

public class SavingsAccountPlus extends SavingdAccount {

	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}
}
