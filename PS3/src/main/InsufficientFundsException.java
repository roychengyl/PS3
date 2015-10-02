package main;

public class InsufficientFundsException extends Exception{
	
	private double lackamount;
	
	public InsufficientFundsException(double lackamount){
		
		this.lackamount = lackamount;
	}
	
	public double getInsufficientFunds(){
		
		return this.lackamount;
		
	}
	
}
