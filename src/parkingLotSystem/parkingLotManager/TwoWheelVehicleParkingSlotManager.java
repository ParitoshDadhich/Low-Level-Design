package parkingLotSystem.parkingLotManager;

import parkingLotSystem.ParkingSlot;
import parkingLotSystem.Vehicle;
import parkingLotSystem.parkingLotManager.ParkingSlotManager;
import parkingLotSystem.parkingStrategy.VehicleParkingStrategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoWheelVehicleParkingSlotManager extends ParkingSlotManager {
    Vehicle vehicle;
    VehicleParkingStrategy vehicleParkingStrategy;
    // assume - total 600 parking slots are available for 2 wheel parking;
    static int TOTAL_SLOTS = 600;
    static int occupiedParkingSlots = 0;
    static int availableParkingSlots = TOTAL_SLOTS;

    private List<ParkingSlot> twoWheelParkingSlotList;

    public TwoWheelVehicleParkingSlotManager(Vehicle vehicle, VehicleParkingStrategy vehicleParkingStrategy) {
        super(new ArrayList<>(Collections.nCopies(TOTAL_SLOTS, new ParkingSlot())), vehicle, vehicleParkingStrategy);
        twoWheelParkingSlotList = super.parkingSlotList;
        setTwoWheelParkingTotalCapacity(TOTAL_SLOTS);
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

    @Override
    public void removeParkedVehicle(int parkingSlotId){
        super.removeParkedVehicle(parkingSlotId);
        occupiedParkingSlots--;
        availableParkingSlots++;
    }

    void addParkingSlot(){
        twoWheelParkingSlotList.add(new ParkingSlot());
        setTotalPakingSlotCapacity(getTotalParkingSlotCapacity() + 1);
        TOTAL_SLOTS++;
    }

    void removeParkingSlot(ParkingSlot parkingSlot){
        twoWheelParkingSlotList.remove(parkingSlot);
        setTotalPakingSlotCapacity(getTotalParkingSlotCapacity() - 1);
        TOTAL_SLOTS--;
    };
}
