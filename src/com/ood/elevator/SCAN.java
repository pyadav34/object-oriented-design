package com.ood.elevator;

import java.util.TreeSet;

public class SCAN  extends ElevatorRequests {
	
	private TreeSet<Integer> up = new TreeSet<>(); // floors above currentFloor
	private TreeSet<Integer> down = new TreeSet<>(); // floors below currentFloor
	
	private Direction direction = Direction.UP;
	
	

	public void addFloor(int f) {
	    if(f < this.currentFloor) {
	        down.add(f);
	    } else if(f > currentFloor) {
	        up.add(f);
	    }
	    // else f == currentFloor, so don't add the floor to either queue
	}

	public int nextFloor() {
	    if(direction == direction.DOWN) {
	        Integer floor= down.pollLast(); // highest floor in down, or null if empty
	        if(floor==null){
	        	direction=Direction.UP;
	        	return up.pollFirst();
	        }
	        return floor;
	    } else {
	        Integer floor= up.pollFirst(); // lowest floor in up, or null if empty
	        if(floor==null){
	        	direction=Direction.DOWN;
	        	return up.pollLast();
	        }
	        return floor;
	    }
	}
	
	enum Direction {
		DOWN,UP;
	}



}
