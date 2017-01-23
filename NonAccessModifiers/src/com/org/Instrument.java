package com.org;

public abstract class Instrument {

	public String name;

	public abstract void play();

	public String getName() {
		return this.name;
	}

	// cannot have final and abstract modifier to a method
	// public final abstract void addTones();

	public final void addTones() {
		System.out.println("Adding default tones to : " +this.name);
	}
}
