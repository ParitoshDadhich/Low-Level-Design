package strategyDesignPattern.vehicle.vehicleTypes;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;

public class Vehicle {
    VehicleStrategy vehicleStrategy;

    // constructor injection
    Vehicle(VehicleStrategy vehicleStrategy){
        this.vehicleStrategy = vehicleStrategy;
    }

    public void driveVehicle(){
        vehicleStrategy.drive();
    }
}
