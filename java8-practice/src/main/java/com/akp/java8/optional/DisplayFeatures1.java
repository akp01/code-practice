package com.akp.java8.optional;

import java.util.Optional;

public class DisplayFeatures1 {

	private String size; // In inches
	private Optional<ScreenResolution> resolution;

	public DisplayFeatures1(String size, Optional<ScreenResolution> resolution){
		this.size = size;
		this.resolution = resolution;
	}

	public String getSize() {
		return size;
	}
	public Optional<ScreenResolution> getResolution() {
		return resolution;
	}

}
