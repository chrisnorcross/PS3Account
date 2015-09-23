

import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(){
	}
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();

	}
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getInterestRate(){
		return annualInterestRate;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setInterestRate(double rate){
		this.annualInterestRate = rate;
	}
	public Date getDateCreated(){
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return this.annualInterestRate/12;
	}
	public void withdraw(double amount)throws InsufficientFundsException
	{
		if(amount <= balance){
			balance -= amount;
		}
		else{
			double needs = amount-balance;
			throw new InsufficientFundsException(needs);
		}
	}
	public void deposit(double amount){
		balance = balance + amount;
	}

}
