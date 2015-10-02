package main;

import java.util.Date;

public class Account {
	
	//•	A private int data field named id for the account (default 0).
	
			private int id = 0;
			
			//•	A private double data field named balance for the account (default 0).
			
			private double balance = 0;
			
			//•	A private double data field named annualInterestRate that stores the current interest rate (default 0). Assume all accounts have the same interest rate.
			
			private double annualInterestRate = 0;
			
			//•	A private Date data field named dateCreated that stores the date when the account was created.
			
			private Date dateCreated = new Date();
			
			//•	A no-arg constructor that creates a default account.
			
			Account() {
				
			}
			
			//•	A constructor that creates an account with the specified id and initial balance.
			
			public Account(int id, double balance){
				
				this.id = id;
				this.balance = balance;
				
			}
			
			//•	The accessor and mutator methods for id, balance, and annualInterestRate. 

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public double getBalance() {
				return balance;
			}

			public void setBalance(double balance) {
				this.balance = balance;
			}

			public double getAnnualInterestRate() {
				return annualInterestRate;
			}

			public void setAnnualInterestRate(double annualInterestRate) {
				this.annualInterestRate = annualInterestRate;
			}
			
			//•	The accessor method for dateCreated. 
			
			public Date getDateCreated() {
				return dateCreated;
			}

			//•	A method named getMonthlyInterestRate() that returns the monthly interest rate.
			
			public double getMonthlyInterestRate(){
				return (annualInterestRate / 12);
			}
			
			//•	A method named withdraw that withdraws a specified amount from the account.
			
			public void withdraw(double amount) throws InsufficientFundsException{
				
				if ((balance - amount) >= 0){
					
					balance = balance - amount;
					
				}else 
					
					throw new InsufficientFundsException(amount - balance);
					
			}

			//•	A method named deposit that deposits a specified amount to the account, if it is not overdrawn.
			
			public void deposit(double amount){
				balance = balance + amount;
			}
			
	public static void main(String[] args) {

	}

}
