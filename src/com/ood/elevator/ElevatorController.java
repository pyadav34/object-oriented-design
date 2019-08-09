package com.ood.elevator;

public class ElevatorController {
   Elevator elevator;
   ElevatorRequests queue;
   
   public void ElevatorController(){
	   elevator=new Elevator();
	   queue=new SCAN();
   }
   
   
   
}
