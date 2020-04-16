package entities;

public class Bank {
	
	private int number;
	private String name;
	private double balance;
	
	public Bank() {
	}

	public Bank(int number, String name) {
		
		this.number = number;
		this.name = name;
	}

	public Bank(int number, String name, double initialDeposit) {
		
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public double getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public double getInitialDeposit() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= (amount + 5.0);
	}

	@Override
	public String toString() {
		return "Bank account " + number + ", holder = " + name 
				+ ", balance = $" + String.format("%.2f", balance);
	}
	
	
}
