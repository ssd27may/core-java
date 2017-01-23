package com.org1;

import com.org.Car;
import com.org.Vehicle;

public class Person {

	public void getPersonVehicleInfo() {
		
		// public accessible
		Vehicle veh = new Vehicle();
		System.out.println(veh.vehicleName);
		
		// protected modifier in non subclasses are not accesisble at all
		//System.out.println(veh.vehicleModel);
		
		// now check if protected variable in a subclass can be accessible
		Car car = new Car();
		// cannot access protected of a subclass too
//		System.out.println(car.vehicleName);
	}
}
