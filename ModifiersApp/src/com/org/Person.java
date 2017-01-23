package com.org;
/**
 * Person class in the same package
 * @author Sidhesh
 *
 */
public class Person {

	// check if non subclass can access the protect modifiers
	Vehicle veh = new Vehicle();
	
	public void getPersonVehicleInfo() {
		
		// so protected are accessible through all classes in same package
		// and subclasses in different package - thrgh inheritance
		// See Person class in other package.
		System.out.println(veh.vehicleModel);
	}
}
