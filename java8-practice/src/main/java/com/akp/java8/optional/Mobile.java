package com.akp.java8.optional;

public class Mobile {

	private long id;
	private String brand;
	private String name;
	private DisplayFeatures displayFeatures;
	// Likewise we can see Memory Features, Camera Features etc.

	public Mobile(long id, String brand, String name, DisplayFeatures displayFeatures) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.displayFeatures = displayFeatures;
	}

	public long getId() {
		return id;
	}

	public String getBrand() {
		return brand;
	}

	public String getName() {
		return name;
	}

	public DisplayFeatures getDisplayFeatures() {
		return displayFeatures;
	}

}
