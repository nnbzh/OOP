package Task2;

public class CheckingAccount extends Account {
	private int numberOfTransactions;
	public CheckingAccount(int a) {
		super(a);
		numberOfTransactions = 0;
	}
	public void deposit(double sum) {
		super.deposit(sum);
		this.numberOfTransactions++;
	}
	public void withdraw(double sum) {
		super.withdraw(sum);
		this.numberOfTransactions++;
	}
	public void transfer(int amount, Account other) {
		super.transfer(amount, other);
		this.numberOfTransactions++;
	}
	public int getNumberOfTransactions() {
		return numberOfTransactions;
	}
	public void deductFee() {
		double chargeAmount = 0.02 * this.numberOfTransactions;
		this.withdraw(chargeAmount);
		this.numberOfTransactions = 0;
	}
}
