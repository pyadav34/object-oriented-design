package com.ood.callcenter;

import java.util.*;
import java.util.List;
import java.util.Queue;

public class CallCenter {
	
	List<Employee>  employeeList;
	Queue<Call>  queue;
	
	
	public CallCenter(){
		employeeList=new ArrayList<>();
		queue=new LinkedList<>();
	}
	
	boolean dispatchCall(Call call){
		Employee emp=findEmployeeToDispatch(call);
		if(emp!=null){
			return emp.handleCall(call);
		}else{
			queue.add(call);
		}
		return true;
	}

	
	public Employee findEmployeeToDispatch(Call call){
		
		Rank rank=call.getRank();
		
		for(Employee emp:employeeList){
			if(emp.isFree()&& emp.rank==rank){
				emp.setBusy();
				return emp;
			}
		}
		
		return null;		
	}
	
	public boolean escalateCall(Call call){
		 call.moveToNextLevel();
		return  dispatchCall(call);
	}
	
	public void  addEmployee(Employee emp){
		employeeList.add(emp);
	}
	
	
	public static void main(String[] args){
		CallCenter callCenter=new CallCenter();
		Responder emp=new Responder(Rank.RESPONDER);
		callCenter.addEmployee(emp);
		Manager emp1=new Manager(Rank.MANAGER);
		callCenter.addEmployee(emp1);
		Director emp2=new Director(Rank.DIRECTOR);
		callCenter.addEmployee(emp2);
		
		Call call=new Call();
		boolean callHandled=callCenter.dispatchCall(call);
		while(!callHandled){
			callHandled=callCenter.escalateCall(call);
		}
	}

}
