package parkingLotSystem;

public class Vehicle {
    private int vehicleNumber;
    private Enum vehicleType;

    Vehicle(int vehicleNumber, Enum vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }
    private int slotNumber = -1;

    public int getVehicleNumber(){
        return vehicleNumber;
    }

    public Enum getVehicleType(){
        return vehicleType;
    }

    public void setSlotNumber(int slotNumber){
        this.slotNumber = slotNumber;
    }

    public int getSlotNumber(){
        return slotNumber;
    }
}
