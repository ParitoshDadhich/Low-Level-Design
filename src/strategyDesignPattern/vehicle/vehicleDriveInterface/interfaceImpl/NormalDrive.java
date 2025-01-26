package strategyDesignPattern.vehicle.vehicleDriveInterface.interfaceImpl;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;

public class NormalDrive implements VehicleStrategy {
    @Override
    public void drive() {
        System.out.println("Normal driving capability!");
    }
}
