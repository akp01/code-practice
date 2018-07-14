package com.akp.java8.optional;

import java.util.Optional;

public class MobileTesterWithOptional {
	public static void main(String[] args) {
		ScreenResolution1 resolution = new ScreenResolution1(750, 1334);
		DisplayFeatures1 dfeatures = new DisplayFeatures1("4.7", Optional.of(resolution));
		Mobile1 mobile = new Mobile1(2015001, "Apple", "iPhone 6s", Optional.of(dfeatures));

		MobileService1 mService = new MobileService1();

		int width = mService.getMobileScreenWidth(Optional.of(mobile));
		System.out.println("Apple iPhone 6s Screen Width = " + width);

		Mobile1 mobile2 = new Mobile1(2015001, "Apple", "iPhone 6s", Optional.empty());
		int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
		System.out.println("Apple iPhone 16s Screen Width = " + width2);
	}

}

class DisplayFeatures1 {

	private String size; // In inches
	private Optional<ScreenResolution1> resolution;

	public DisplayFeatures1(String size, Optional<ScreenResolution1> resolution) {
		this.size = size;
		this.resolution = resolution;
	}

	public String getSize() {
		return size;
	}

	public Optional<ScreenResolution1> getResolution() {
		return resolution;
	}

}

class Mobile1 {
	private long id;
	private String brand;
	private String name;
	private Optional<DisplayFeatures1> displayFeatures;
	// Like wise we can see MemoryFeatures, CameraFeatures etc.
	// For simplicity, using only one Features

	public Mobile1(long id, String brand, String name, Optional<DisplayFeatures1> displayFeatures) {
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

class MobileService1 {
	public Integer getMobileScreenWidth(Optional<Mobile1> mobile) {
		return mobile.flatMap(Mobile1::getDisplayFeatures).flatMap(DisplayFeatures1::getResolution)
				.map(ScreenResolution1::getWidth).orElse(0);

	}

}

class ScreenResolution1 {

	private int width;
	private int height;

	public ScreenResolution1(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
