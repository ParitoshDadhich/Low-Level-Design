package parkingLotSystem;

import parkingLotSystem.parkingLotManager.ParkingSlotManager;

import java.util.Date;

public class EntranceGate {
    ParkingSlotManager parkingSlotManager;
    Ticket ticket;
    Vehicle vehicle;
    static int availableParkingSpotNumber = -1;


    EntranceGate(ParkingSlotManager parkingSlotManager, Ticket ticket, Vehicle vehicle){
        this.parkingSlotManager = parkingSlotManager;
        this.ticket = ticket;
        this.ticket.entryTime = new Date();
        this.vehicle = vehicle;
    }

    int findParkingSlot(Vehicle vehicle){
        if(vehicle.getVehicleType() == VehicleType.two_wheel_vehicle){
            this.availableParkingSpotNumber = parkingSlotManager.findEmptyParkingSlot(parkingSlotManager.getTwoWheelParkingTotalCapacity());
        }
        else if (vehicle.getVehicleType() == VehicleType.four_wheel_vehicle){
            this.availableParkingSpotNumber = parkingSlotManager.findEmptyParkingSlot(parkingSlotManager.getFourWheelParkingTotalCapacity());
        } else{
            throw new IllegalArgumentException("Vehicle is not allowed!");
        }

        return this.availableParkingSpotNumber;
    }

    void generateTicket(Vehicle vehicle){
        System.out.println("Ticket has been generated for Vehicle: " + vehicle + " on slot number: " + availableParkingSpotNumber);
    }

    void parkVehicle(){
        if(vehicle.getVehicleType() == VehicleType.two_wheel_vehicle){
            parkingSlotManager.parkVehicle(parkingSlotManager.getTwoWheelParkingTotalCapacity());
        }
        else if (vehicle.getVehicleType() == VehicleType.four_wheel_vehicle){
            parkingSlotManager.parkVehicle(parkingSlotManager.getFourWheelParkingTotalCapacity());
        } else{
            throw new IllegalArgumentException("Vehicle is not allowed!");
        }
    }

}
