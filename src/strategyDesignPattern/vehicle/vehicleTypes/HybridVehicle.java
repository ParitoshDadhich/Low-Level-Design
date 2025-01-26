package strategyDesignPattern.vehicle.vehicleTypes;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;

public class HybridVehicle extends Vehicle{
    public HybridVehicle(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
}
