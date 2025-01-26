package parkingLotSystem;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingSlot {

    public void parkVehicle(Vehicle vehicle){
        System.out.println("Park vehicle of type: " + vehicle.getVehicleType() + " at the slot number: " + vehicle.getSlotNumber());
    }

    public void removeVehicle(Vehicle vehicle){
        System.out.println("Remove vehicle of type: " + vehicle.getVehicleType() + " from the slot number: " + vehicle.getSlotNumber());
    }
}
