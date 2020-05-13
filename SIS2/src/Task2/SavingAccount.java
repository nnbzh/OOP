package Task2;

public class SavingAccount extends Account {
	
	public SavingAccount(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	public void deposit(double sum) {
		super.deposit(sum);
	}
	public void transfer(int amount, Account other) {
		super.transfer(amount, other);
	}
	public void withdraw(double sum) {
		throw new UnsupportedOperationException("You cannot withdraw money from the Saving Account. Transfer it to your Checking Account");
	}
	public void interest() {
		double interestAmount = 0.10 * this.getBalance();
		this.deposit(interestAmount);
	}
}
