package entities;

public class Conta {
	
	private int account;
	private String name;
	private double saldo;

	
	public Conta() {
	}

	public Conta(int account, String name, double initialDeposit) {
		this.account = account;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Conta(int account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public void deposit(double saldo) {
		this.saldo += saldo;
	}
	
	public void saque(double saldo) {
		this.saldo-= saldo + 5.00;
	}

	public int getAccount() {
		return account;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Account "
				+ account
				+", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
	
}
