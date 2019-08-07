package com.ood.atm;

public class Account {
	
	int amount;
	
	void withdrawMoney(int amt){
		amount=amount-amt;
		System.out.print("withdrawn:"+amt);
	}

	
	void depositMoney(int amt){
		amount=amount+amt;
		System.out.print("deposited:"+amt);
	}
	
	
	int getBalance(){
		return amount;
	}
}
