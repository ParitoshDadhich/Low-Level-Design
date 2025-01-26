package parkingLotSystem.parkingLotManager;

import parkingLotSystem.ParkingSlot;
import parkingLotSystem.Vehicle;
import parkingLotSystem.parkingStrategy.VehicleParkingStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ParkingSlotManager {
    private static int totalCapacity = 1000;
    private static int twoWheelParkingTotalCapacity;
    private static int fourWheelParkingTotalCapacity;
    private static int emptySlots = totalCapacity;
    private int filledSlots = 0;

    List<ParkingSlot> parkingSlotList;
    static List<Boolean> listOfOccupiedParkingSlots = new ArrayList<>(Collections.nCopies(1000, false));
    Vehicle vehicle;
    VehicleParkingStrategy vehicleParkingStrategy;

    ParkingSlotManager(List<ParkingSlot> parkingSlotList, Vehicle vehicle, VehicleParkingStrategy vehicleParkingStrategy){
        this.parkingSlotList = parkingSlotList;
        this.vehicle = vehicle;
        this.vehicleParkingStrategy = vehicleParkingStrategy;
    }

    public void parkVehicle(int totalSlots){
        int emptyParkingSlot = findEmptyParkingSlot(totalSlots);
        ParkingSlot parkingSlot = parkingSlotList.get(emptyParkingSlot);

        vehicle.setSlotNumber(emptyParkingSlot);

        listOfOccupiedParkingSlots.set(vehicle.getSlotNumber(), true);
        parkingSlot.parkVehicle(this.vehicle);
        emptySlots--;
        filledSlots++;
    }

    public void removeParkedVehicle(int parkingSlotId){
        ParkingSlot parkingSlot = parkingSlotList.get(parkingSlotId);
        parkingSlot.parkVehicle(this.vehicle);

        listOfOccupiedParkingSlots.set(vehicle.getSlotNumber(), false);
        // SINCE VEHICLE IS NO LONGER PARKED; WE CAN SET SLOT NUMBER TO -1;
        vehicle.setSlotNumber(-1);
        filledSlots--;
        emptySlots++;
    }

    public int findEmptyParkingSlot(int totalSlots){
        vehicleParkingStrategy.parkVehicle();
        System.out.println(totalSlots);
        for(int i=0; i<totalSlots; i++){
            if(!listOfOccupiedParkingSlots.get(i)){
                return i;
            }
        }

        throw new RuntimeException("Parking Slots are not available!");
    }

    public void setTotalPakingSlotCapacity(int newTotalCapacity){
        totalCapacity = newTotalCapacity;
    }

    public int getTotalParkingSlotCapacity(){
        return totalCapacity;
    }

    public int getTotalAvailableEmptySlots(){
        return emptySlots;
    }

    public int getTotalFilledSlots(){
        return filledSlots;
    }

    public void setTwoWheelParkingTotalCapacity(int parkingCapacity){
        twoWheelParkingTotalCapacity = parkingCapacity;
    }

    public int getTwoWheelParkingTotalCapacity(){
        return twoWheelParkingTotalCapacity;
    }

    public void setFourWheelParkingTotalCapacity(int parkingCapacity){
        fourWheelParkingTotalCapacity = parkingCapacity;
    }

    public int getFourWheelParkingTotalCapacity(){
        return fourWheelParkingTotalCapacity;
    }

    abstract void addParkingSlot();
    abstract void removeParkingSlot(ParkingSlot parkingSlot);
}
