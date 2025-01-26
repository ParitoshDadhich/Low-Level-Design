package strategyDesignPattern.vehicle;

import strategyDesignPattern.vehicle.vehicleDriveInterface.VehicleStrategy;
import strategyDesignPattern.vehicle.vehicleDriveInterface.interfaceImpl.HybridDrive;
import strategyDesignPattern.vehicle.vehicleDriveInterface.interfaceImpl.NormalDrive;
import strategyDesignPattern.vehicle.vehicleDriveInterface.interfaceImpl.OffRoadDrive;
import strategyDesignPattern.vehicle.vehicleTypes.HybridVehicle;
import strategyDesignPattern.vehicle.vehicleTypes.PassengerVehicle;
import strategyDesignPattern.vehicle.vehicleTypes.SportyVehicle;
import strategyDesignPattern.vehicle.vehicleTypes.Vehicle;

public class Driver {
    public static void main(String[] args) {
        VehicleStrategy hybridDrive = new HybridDrive();
        VehicleStrategy normalDrive = new NormalDrive();
        VehicleStrategy offRoadDrive = new OffRoadDrive();

        Vehicle vehicle1 = new HybridVehicle(hybridDrive);
        Vehicle vehicle2 = new PassengerVehicle(normalDrive);
        Vehicle vehicle3 = new SportyVehicle(offRoadDrive);

        System.out.println("Hybrid Vehicle!");
        vehicle1.driveVehicle();
        System.out.println("\n*****************\n");

        System.out.println("Passenger Vehicle");
        vehicle2.driveVehicle();
        System.out.println("\n*****************\n");

        System.out.println("Sporty Vehicle");
        vehicle3.driveVehicle();

    }
}
