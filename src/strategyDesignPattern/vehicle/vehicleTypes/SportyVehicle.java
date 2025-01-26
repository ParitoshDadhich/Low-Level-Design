package strategyDesignPattern.vehicle.vehicleTypes;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;

public class SportyVehicle extends Vehicle{
    public SportyVehicle(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
}
