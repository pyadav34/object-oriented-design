package com.ood.callcenter;

public class Call {
	
	Rank rank=Rank.RESPONDER;

	
	public Rank getRank(){
		return rank;
	}
	
	public Rank upgradeRank(){
		return rank;
	}
	
	public Rank moveToNextLevel(){
		
		if(rank==Rank.RESPONDER){
			rank=Rank.MANAGER;
			return Rank.MANAGER;
		}else{
			rank=Rank.DIRECTOR;
			return Rank.DIRECTOR;
		}
	
	
	}
}
