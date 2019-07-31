package com.ood.callcenter;

import java.util.*;

public class Manager  extends Employee {
	
	
	public Manager(Rank rank){
		super(rank);
	}

	@Override
	boolean handleCall(Call call) {
		System.out.println("Handled  Call by manager");
		    
		return false;
	}

}
