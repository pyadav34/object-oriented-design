package com.ood.callcenter;

public class Responder  extends Employee {
	
	
	public Responder(Rank rank){
		super(rank);
	}

	@Override
	boolean handleCall(Call call) {
		System.out.println("Handled  Call by responder");
		return false;
	}

}
