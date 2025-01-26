package parkingLotSystem.parkingStrategy;

import parkingLotSystem.parkingStrategy.VehicleParkingStrategy;

public class ParkVehicleNearestToEntranceAndLift implements VehicleParkingStrategy {
    @Override
    public void parkVehicle() {
        System.out.println("Park vehicle nearest possible distance from entrance gate and lift!");
    }
}
