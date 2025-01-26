package parkingLotSystem.costComputation;

import parkingLotSystem.costComputation.CostComputation;
import parkingLotSystem.priceStrategy.PriceStrategy;

public class FourWheelCostComputation implements CostComputation {
    double fourWheelStandardPrice = 20;
    PriceStrategy priceStrategy;

    FourWheelCostComputation(PriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
    }

    @Override
    public double price(double timeSpendInParkingLot) {
        return timeSpendInParkingLot >= 1 ?
                timeSpendInParkingLot * fourWheelStandardPrice * priceStrategy.price() :
                fourWheelStandardPrice * priceStrategy.price();
    }
}
