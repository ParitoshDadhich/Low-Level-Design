package parkingLotSystem.parkingLotManager;

import parkingLotSystem.ParkingSlot;
import parkingLotSystem.Vehicle;
import parkingLotSystem.parkingStrategy.VehicleParkingStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourWheelVehicleParkingSlotManager extends ParkingSlotManager {
    Vehicle vehicle;
    VehicleParkingStrategy vehicleParkingStrategy;
    // assume - total 600 parking slots are available for 2 wheel parking;
    static int TOTAL_SLOTS = 400;
    static int occupiedParkingSlots = 0;
    static int availableParkingSlots = TOTAL_SLOTS;
    private List<ParkingSlot> fourWheelParkingSlotList;

    FourWheelVehicleParkingSlotManager(Vehicle vehicle, VehicleParkingStrategy vehicleParkingStrategy) {
        super(new ArrayList<>(Collections.nCopies(TOTAL_SLOTS, new ParkingSlot())), vehicle, vehicleParkingStrategy);
        fourWheelParkingSlotList = super.parkingSlotList;
        setFourWheelParkingTotalCapacity(TOTAL_SLOTS);
    }


    public void parkVehicle(int x){
        if(occupiedParkingSlots <= availableParkingSlots) {
            super.parkVehicle(TOTAL_SLOTS);
            occupiedParkingSlots++;
            availableParkingSlots--;
        } else{
            throw new IllegalArgumentException("Parking space is not available!");
        }
    }

    void removeParkedFourWheelVehicle(int parkingSlotId){
        removeParkedVehicle(parkingSlotId);
        occupiedParkingSlots--;
        availableParkingSlots++;
    }

    void addParkingSlot(){
        fourWheelParkingSlotList.add(new ParkingSlot());
        setTotalPakingSlotCapacity(getTotalParkingSlotCapacity() + 1);
        TOTAL_SLOTS++;
    }

    void removeParkingSlot(ParkingSlot parkingSlot){
        fourWheelParkingSlotList.remove(parkingSlot);
        setTotalPakingSlotCapacity(getTotalParkingSlotCapacity() - 1);
        TOTAL_SLOTS--;
    };
}
