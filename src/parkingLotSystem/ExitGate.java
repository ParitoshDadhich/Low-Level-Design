package parkingLotSystem;

import parkingLotSystem.costComputation.CostComputation;
import parkingLotSystem.costComputation.CostComputationFactory;
import parkingLotSystem.parkingLotManager.ParkingSlotManager;
import parkingLotSystem.priceStrategy.HourBasedPriceStrategy;
import parkingLotSystem.priceStrategy.MinBasedPriceStrategy;
import parkingLotSystem.priceStrategy.PriceStrategy;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ExitGate {
    Vehicle vehicle;
    Ticket ticket;
    ParkingSlotManager parkingSlotManager;
    CostComputationFactory costComputationFactory;
    PriceStrategy priceStrategy;

    ExitGate(Vehicle vehicle, Ticket ticket, ParkingSlotManager parkingSlotManager, PriceStrategy priceStrategy){
        this.vehicle = vehicle;
        this.parkingSlotManager = parkingSlotManager;
        this.priceStrategy = priceStrategy;
        this.ticket = ticket;
        this.ticket.exitTime = new Date();
    }

    void priceCalculate(){
        long timeSpentInParking = this.ticket.exitTime.getTime() - this.ticket.entryTime.getTime();

        // Calculate difference in milliseconds
        long differenceInMillis = this.ticket.exitTime.getTime() - this.ticket.entryTime.getTime();
        // Convert difference to hours and minutes
        double differenceInHours = (double) differenceInMillis / (1000 * 60 * 60);
        double differenceInMinutes = TimeUnit.MILLISECONDS.toMinutes(differenceInMillis) % 60;

        costComputationFactory = new CostComputationFactory(this.priceStrategy);
        CostComputation costComputation = costComputationFactory.getCostComputation(vehicle.getVehicleType());


        if(priceStrategy instanceof HourBasedPriceStrategy){
            System.out.println("Total parking price: " + costComputation.price(differenceInHours));
        }
        else if(priceStrategy instanceof MinBasedPriceStrategy){
            System.out.println("Total parking price: " + costComputation.price(differenceInMinutes));
        }
    }

    void removeVehicle(){
        parkingSlotManager.removeParkedVehicle(vehicle.getSlotNumber());
    }


}
