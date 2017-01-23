package com.org1;

import com.org.Instrument;

public class InstrumentSampleApp {

	public static void main(String[] args) {
		
		// cannot instantiate instrument class since it is abstract
		//Instrument inst = new Instrument();
		
		// check if final method can be accessed on subclass instance
		Guitar guitar = new Guitar();
		guitar.addTones();
		
	}
}
