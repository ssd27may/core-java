package com.org1;

import com.org.Vehicle;

public class Truck extends Vehicle {

	public void displayTruckInfo() {

		Vehicle veh = new Vehicle();
		// default not accessible as in different package
		// System.out.println(registrationDate);

		// also default not accessible through direct access
		// System.out.println(registrationDate);

		// public modifier test
		// public accessible in subclass and different pacakge
		System.out.println(vehicleName);

		// protected modifier
		// accessible only through inheritance
		System.out.println(vehicleModel);
		
		// protected not accessible through direct access
		//System.out.println(veh.vehicleModel);
		
		// now below will not result into compilation error
		// this is becoz protected members are like its own members in the subclass
		// so they are like public members
		Truck truck = new Truck();
		System.out.println(truck.vehicleModel);
	}
}
