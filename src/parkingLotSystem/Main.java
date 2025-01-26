package parkingLotSystem;

import parkingLotSystem.parkingLotManager.ParkingSlotManager;
import parkingLotSystem.parkingLotManager.TwoWheelVehicleParkingSlotManager;
import parkingLotSystem.parkingStrategy.ParkVehicleNearestToEntrance;
import parkingLotSystem.parkingStrategy.VehicleParkingStrategy;
import parkingLotSystem.priceStrategy.MinBasedPriceStrategy;
import parkingLotSystem.priceStrategy.PriceStrategy;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Vehicle bike1 = new Vehicle(1, VehicleType.two_wheel_vehicle);
        VehicleParkingStrategy nearestToEntranceStrategy = new ParkVehicleNearestToEntrance();
        ParkingSlotManager twoWheelVehicleParkingSlotManager = new TwoWheelVehicleParkingSlotManager(bike1, nearestToEntranceStrategy);
        Ticket ticketForBike1 = new Ticket(bike1);
        EntranceGate entranceGate = new EntranceGate(twoWheelVehicleParkingSlotManager, ticketForBike1, bike1);

        int availableParkingSpot = entranceGate.findParkingSlot(bike1);
        entranceGate.generateTicket(bike1);
        twoWheelVehicleParkingSlotManager.parkVehicle(0);

        // exit gate
        Thread.sleep(1000);
        PriceStrategy minPriceStrategy = new MinBasedPriceStrategy();
        ExitGate exitGate = new ExitGate(bike1, ticketForBike1, twoWheelVehicleParkingSlotManager, minPriceStrategy);
        exitGate.priceCalculate();
        exitGate.removeVehicle();

//        vehicleParkingConfiguration(twoWheelVehicleParkingSlotManager);


//        Vehicle car1 = new Vehicle(101, VehicleType.four_wheel_vehicle);

//        vehicleParkingConfiguration();
    }
}
