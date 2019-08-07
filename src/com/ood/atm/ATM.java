package com.ood.atm;

public class ATM {
	
	BankDAO dao;
	
	Screen screen;
	
	CashDispenser cashDispenser;
	
	DepositSlot depositSlot;
	
	CardReader cardReader;
	
	Account account;
	
	public ATM(){
		dao=new BankDAO();
		screen=new Screen();
		cashDispenser=new CashDispenser();
		depositSlot=new DepositSlot();
	}
	
	void insertCard(Card card){
		account= dao.getAccount(card);
	}
	
	
	void cashWithdrawl(int amount){
         		
		account.withdrawMoney(amount);
		cashDispenser.dispenseCash(amount);
	}
	
	void depositCash(int amt){
		account.depositMoney(amt);
		depositSlot.acceptCash(amt);
	}
	
	int currentBalance(){
		System.out.print("Current balance:"+account.getBalance());
		return account.getBalance();
	}
	
	
	public static void main(String[] args){
		ATM atm=new ATM();
		Card card=new Card();
		atm.insertCard(card);
		
		atm.depositCash(100);
		
		atm.cashWithdrawl(10);
		
		atm.currentBalance();
	}

}
