package entities;

public class SavingdAccount extends Account {
	
	private Double interestRate;
	
	public SavingdAccount() {
		super();
	}

	public SavingdAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	// Sobreposição.
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	
}
