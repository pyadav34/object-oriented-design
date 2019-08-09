package com.ood.elevator;

public abstract class Button {
	
	ElevatorRequests requests;
	
	public void Button(ElevatorRequests requests){
		this.requests=requests;
	}
	
	public void illuminate(){
		
	}
	
	public void stopIlluminate(){
		
	}
	
	abstract void placeRequest();

}
