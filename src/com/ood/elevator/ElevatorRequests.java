package com.ood.elevator;

public abstract class ElevatorRequests {

	public abstract void addFloor(int f);
	
	public abstract int nextFloor();
	
	protected int currentFloor;
	
}
