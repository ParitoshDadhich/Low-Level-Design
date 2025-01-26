package parkingLotSystem.parkingStrategy;

import parkingLotSystem.parkingStrategy.VehicleParkingStrategy;

public class ParkVehicleRandandomly implements VehicleParkingStrategy {
    @Override
    public void parkVehicle() {
        System.out.println("Park vehicle in any available slot!");
    }
}
