package com.akp.cp.map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DistribuitionCenterTruckService implements
		IDistribuitionCenterVehicleService<Truck> {
	// Ensure that ONLY ONE ConcurrentHashMap is used for every thread
	private static final ConcurrentMap<Truck, Long> vehicleQueue = new ConcurrentHashMap();

	@Override
	public void arrivalQueue(Truck vehicle) {
		long currentTime = System.currentTimeMillis();
		DistribuitionCenterTruckService.vehicleQueue.putIfAbsent(vehicle, currentTime);
	}

	@Override
	public boolean unloadInProgress(Truck vehicle) {
		return DistribuitionCenterTruckService.vehicleQueue.get(vehicle) != null;
	}
	
	@Override
	public void departureQueue(Truck vehicle) {
		DistribuitionCenterTruckService.vehicleQueue.remove(vehicle);
	}
}
