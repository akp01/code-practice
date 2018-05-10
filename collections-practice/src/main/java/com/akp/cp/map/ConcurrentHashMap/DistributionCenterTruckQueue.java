package com.akp.cp.map.ConcurrentHashMap;



import java.util.concurrent.Callable;



public class DistributionCenterTruckQueue implements Callable<Truck> {
	public static enum OPERATION { ARRIVAL, DEPARTURE, INPROGRESS }
	
	private IDistribuitionCenterVehicleService<Truck> truckService;
	
	private Truck vehicle;
	private OPERATION operation;
	
	public DistributionCenterTruckQueue() { }
	
	public DistributionCenterTruckQueue(Truck vehicle, OPERATION operation) {
		this.vehicle = vehicle;
		this.operation = operation;
		
		this.truckService = new DistribuitionCenterTruckService();
	}

	@Override
	public Truck call() throws Exception {
		
		switch (this.operation) {
			case ARRIVAL:
				System.out.print("Arriving: ");
				this.truckService.arrivalQueue(this.vehicle);
				break;
			case DEPARTURE:
				System.out.print("Departing: ");
				this.truckService.departureQueue(this.vehicle);
				break;
			case INPROGRESS:
				System.out.print("In Progress: ");
				this.vehicle.setInprogress(this.truckService.unloadInProgress(this.vehicle));
				break;
		}
		
		return this.vehicle;
	}
}
