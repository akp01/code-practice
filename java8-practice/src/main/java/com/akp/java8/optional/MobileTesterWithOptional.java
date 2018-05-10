package com.akp.java8.optional;

import java.util.Optional;

public class MobileTesterWithOptional {
	public static void main(String[] args) {
		ScreenResolution resolution = new ScreenResolution(750,1334);
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
