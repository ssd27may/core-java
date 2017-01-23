package com.org;

public class Car extends Vehicle {

	public void displayCarInfo() {
		Vehicle veh = new Vehicle();

		// default access
		System.out.println(registrationDate);
		System.out.println(veh.registrationDate);

		// public modifiers check
		// public accessible in subclass and same package
		// accessing through inheritance
		System.out.println(vehicleName);

		// accessible also through direct access
		System.out.println(veh.vehicleName);

		// private not accessible -- compilation error
		// System.out.println(vehicleId);

		//protected accessible in subclasses
		// thrgh direct as well as thrg inheritance
		System.out.println(veh.vehicleModel);
		
		//thrgh inheritance
		System.out.println(vehicleModel);
	}
}
