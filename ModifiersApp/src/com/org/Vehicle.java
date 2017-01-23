package com.org;

import java.util.Date;

/**
 * This is the main class. It defines three variables with three different access modifiers.
 * 
 * Public are accessible from any class in the application.
 * 
 * Protected are accessible only from subclasses in same package or diff package.
 * 
 * Private are accessible only from same class.
 *
 */
public class Vehicle {

	public String vehicleName;
	
	private int vehicleId;
	
	protected int vehicleModel;
	
	Date registrationDate;
	
	protected void getVehicleInfo(){
		System.out.println("Vehicle Name : "+vehicleName);
		System.out.println("Vehicle Id  : "+vehicleId);
		System.out.println("Vehicle Year : "+vehicleModel);
	}
}
