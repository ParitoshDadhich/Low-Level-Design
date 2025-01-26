package parkingLotSystem.parkingStrategy;

import parkingLotSystem.parkingStrategy.VehicleParkingStrategy;

public class ParkVehicleNearestToEntrance implements VehicleParkingStrategy {
    @Override
    public void parkVehicle() {
        System.out.println("Park vehicle nearest possible distance to entrance gate!");
    }
}
