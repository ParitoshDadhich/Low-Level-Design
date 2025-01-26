package strategyDesignPattern.vehicle.vehicleDriveInterface.interfaceImpl;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;

public class OffRoadDrive implements VehicleStrategy {
    @Override
    public void drive() {
        System.out.println("Off-road driving capability!");
    }
}
