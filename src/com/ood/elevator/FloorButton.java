package com.ood.elevator;

public class FloorButton extends Button{

	int floorNo;
	
	void FloorButton(int floorNo){
		this.floorNo=floorNo;
	}
	
	@Override
	void placeRequest() {
		super.requests.addFloor(floorNo);
		
	}

}
