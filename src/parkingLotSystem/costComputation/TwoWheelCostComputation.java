package parkingLotSystem.costComputation;

import parkingLotSystem.costComputation.CostComputation;
import parkingLotSystem.priceStrategy.PriceStrategy;

public class TwoWheelCostComputation implements CostComputation {
    double twoWheelStandardPrice = 10;
    PriceStrategy priceStrategy;
    TwoWheelCostComputation(PriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
    }

    @Override
    public double price(double timeSpendInParkingLot) {
        return  timeSpendInParkingLot >= 1 ?
                timeSpendInParkingLot * twoWheelStandardPrice * priceStrategy.price() :
                twoWheelStandardPrice * priceStrategy.price();
    }
}
