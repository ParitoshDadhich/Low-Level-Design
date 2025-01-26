package parkingLotSystem;

import java.util.Date;

public class Ticket {
    Vehicle vehicle;
    Date entryTime, exitTime;

    Ticket(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    int getVehicleParkingSlot(){
        return vehicle.getSlotNumber();
    }
}
