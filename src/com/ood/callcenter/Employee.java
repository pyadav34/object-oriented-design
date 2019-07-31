package com.ood.callcenter;

abstract public class Employee {
	
	Rank rank;
	
	boolean free=true;
	
	public Employee(Rank rank){
		this.rank=rank;
	}
	
	abstract boolean handleCall(Call call);
	
   public boolean isFree(){
	   return free;
   }
   
   public void setBusy(){
	   free=false;
   }
   
   public void setFree(){
	   free=false;
   }

}
