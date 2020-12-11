package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance, withdraw;
	
	public Account(){
		
	}

	public Account(Integer number, String holder, Double balance, Double withdraw) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdraw() {
		return withdraw;
	}
	
	
	
	public void withdraw(Double amount) throws DomainException{
		if (amount > withdraw) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		else if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
		balance -= amount;
	}
	
}
