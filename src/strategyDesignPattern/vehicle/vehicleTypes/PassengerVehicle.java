package strategyDesignPattern.vehicle.vehicleTypes;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(VehicleStrategy vehicleStrategy) {
        super(vehicleStrategy);
    }
}
