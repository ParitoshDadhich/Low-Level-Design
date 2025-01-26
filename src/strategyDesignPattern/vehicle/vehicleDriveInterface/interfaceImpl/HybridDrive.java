package strategyDesignPattern.vehicle.vehicleDriveInterface.interfaceImpl;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;

public class HybridDrive implements VehicleStrategy {
    @Override
    public void drive() {
        System.out.println("Normal and Off-road driving capability!");
    }
}
