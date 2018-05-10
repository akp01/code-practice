package com.akp.java8.optional;

import java.util.Optional;

public class Mobile1 {

	private long id;
	private String brand;
	private String name;
	private Optional<DisplayFeatures1> displayFeatures;
	// Like wise we can see MemoryFeatures, CameraFeatures etc.
	// For simplicity, using only one Features

	public Mobile1(long id, String brand, String name, Optional<DisplayFeatures1> displayFeatures){
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

	public Optional<DisplayFeatures1> getDisplayFeatures() {
		return displayFeatures;
	}

}
