package com.cg;

public class Account {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount)
			throws BalancedException {
		
		if(amount <= balance) {
			balance -= amount;
			return balance;
		}else
			throw new BalancedException("Insufficient funds!");
	}

}
