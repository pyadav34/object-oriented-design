package com.ood.callcenter;

public class Director extends Employee {
	
	
	public Director(Rank rank){
		super(rank);
	}

	@Override
	boolean handleCall(Call call) {
		System.out.println("Handled  Call by Director");
		    
		return true;
	}

}
