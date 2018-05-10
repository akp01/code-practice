package com.akp.java8.function.supplier;

import java.util.function.Supplier;

public class SupplierTest1 {

	public static void main(String[] args) {
		// Using Lambda expression
		driveVehicle(() -> new Vehicle());
		driveVehicle(() -> new Car());

		// Using method expression
		driveVehicle(Vehicle::new);
		driveVehicle(Car::new);

	}

	static void driveVehicle(Supplier<? extends Vehicle> supplier) {
		Vehicle vehicle = supplier.get();
		vehicle.drive();
	}

}

class Vehicle {
	public void drive() {
		System.out.println("Driving vehicle ...");
	}
}

class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving car...");
	}
}
