package com.akp.java8.optional;

import java.util.Optional;

public class MobileService1 {
	public Integer getMobileScreenWidth(Optional<Mobile1> mobile){
		return mobile.flatMap(Mobile1::getDisplayFeatures)
			 .flatMap(DisplayFeatures1::getResolution)
			 .map(ScreenResolution::getWidth)
			 .orElse(0);

	  }


}
