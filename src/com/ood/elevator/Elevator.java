package com.ood.elevator;

public class Elevator {
	
	Button button;
	int currentFloor=0;
	
	public void moveUp(){
		System.out.println("Elevator moving up");
	}	
	
	public void moveDown(){
		System.out.println("Elevator moving down");
	}
	
	public void openDoor(){
		System.out.println("Elevator open door");
	}
	
	public void closeDoor(){
		System.out.println("Elevator close door");
	}

}
