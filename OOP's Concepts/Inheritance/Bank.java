package Inheritance;
import java.util.*;
class BankAccount{
	double amount;
	double balance;
	Scanner scan = new Scanner(System.in);
	BankAccount(double initialbalance){
		System.out.println("Enter amount : $");
		balance = scan.nextDouble();
	    balance = initialbalance;
	}
	double getBalance() {
		return balance;
	}
	void deposit() {
		System.out.println("Enter deposit amount : $");
		amount = scan.nextDouble();
		balance += amount;
	}
	void withdraw(double amount) {
		System.out.println("Enter withdrawal amount : $");
		amount = scan.nextDouble();
		if(amount <= balance) {
			balance -= amount;
		}
		else {
			System.out.println("Insufficiant Funds in account");
		}
	}
}
class SavingAccount extends BankAccount{
	double withdrawlimit;
	SavingAccount(double initialbalance,double withdrawlimit){
		super(initialbalance);
		this.withdrawlimit = withdrawlimit;
	}
	void withdraw() {
		if(amount <= withdrawlimit) {
			super.withdraw(amount);
		}
		else {
			System.out.println("withdraw limit is exceeds");
		}
	}
}
class currentAccount extends BankAccount{
	double overdraftfee;
	currentAccount(double initialBalance, double overdraftfee){
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
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
		int ch;
		System.out.println("Enter your choice :");
		ch = scan.nextInt();
        while(ch !=3) {
        	System.out.println("\n 1. Saving Account \n2. Current Account ");
          switch(ch){
          case 1:
        	  System.out.println("\n ------- Saving Account------");
                 System.out.println("\n 1. Withdraw \n 2. deposit \n 3. check balance");
                int n;
                n =scan.nextInt();
                if(n==1) {
                	
                }
          }
      }
   
}
}