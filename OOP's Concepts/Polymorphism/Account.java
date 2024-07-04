package Polymorphism;
class BankAccount{
	double amount;
	double balance;
	BankAccount(double initialBalance){
		this.balance = initialBalance;
	}
	double getBalance() {
		return balance;
	}
	void deposit(double amount) {
		balance = balance + amount;
	}
	void withdraw(double amount) {
		if(amount <= balance) {
	       balance = balance - amount;
		}
		else {
			System.out.println("Insufficiant Funds in account");
		}
	}
	
}

class SavingAccount extends BankAccount{
	double withdrawlimit;
	SavingAccount(double initialBalance,double withdrawlimit){
		super(initialBalance);
		this.withdrawlimit = withdrawlimit;
	}
	void withdraw(double amount) {
		if(amount <= withdrawlimit) {
			super.withdraw(amount);
		}
		else {
			System.out.println("withdraw limit is exceeds");
		}
	}
}
class checkAccount extends BankAccount{
	double overdraftfee;
	checkAccount(double initialBalance, double overdraftfee){
		super(initialBalance);
		this.overdraftfee = overdraftfee;
	}
	void withdraw(double amount) {
		if(amount <= getBalance()) {
			super.withdraw(amount);
		}
		else {
			System.out.println("Overdraft fees are applied ");
			super.withdraw(amount + overdraftfee);
		}
	}
}

public class Account {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankAccount  savingAcc = new SavingAccount(10000,200);
       BankAccount  checkAcc = new checkAccount(20000,300);
       withdrawFromAccount(savingAcc,300);
       withdrawFromAccount(checkAcc, 500);
       System.out.println("Saving Account Balance: "+ savingAcc.getBalance());
       System.out.println("Checking Account Balance: " + checkAcc.getBalance());
       }
	static void withdrawFromAccount(BankAccount account, double amount) {
		account.withdraw(amount);
	}
}

