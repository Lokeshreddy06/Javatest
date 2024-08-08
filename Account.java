package bankAccountApp;

public abstract class Account implements IBaseRate {
	//List of common properties for checking and savings accounts
	private String name;
	private String sSN;
	private double balance;
	
	static int unique=10000;
	protected String accountNumber;
	protected double rate;
	// constructor to set base properties and inisilize account
	public Account(String name,String sSN,double deposit) {
		balance=deposit;
		this.name=name;
		this.sSN=sSN;
		
		this.accountNumber=setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoDigits=sSN.substring(sSN.length()-2 ,sSN.length());
		int uniqueId=unique;
		unique++;
		int min = 100;
		int max = 999;
		int randomNumber = min + (int) (Math.random() * (max - min + 1));
		return lastTwoDigits+uniqueId+randomNumber;
		
	}
	//list common methods
	public void compound() {
		double compoundIntrest=balance*(rate/100);
		balance=balance+compoundIntrest;
		System.out.println("Compount Intrest : "+compoundIntrest);
		getBalance();
	}
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("amount deposited");
		getBalance();
	}
	
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("insufficient balance");
		}else {
		balance=balance-amount;
		System.out.println("amount withdrawn");
		}
		getBalance();
	}
	
	public void transfer(double amount,String where) {
		if(amount>balance) {
			System.out.println("insufficient balance");
		}else {
		balance=balance-amount;
		System.out.println("amount transfered to "+where);
		}
		getBalance();
	}
	
	public void getBalance() {
		System.out.println("your balance : "+balance);
	}
	
	public void showInfo() {
		System.out.println(
				"Name : "+ name+
				"\nAccount number : "+accountNumber+
				"\nBalance : "+balance
				);
	}
}
