package parkingLotSystem.priceStrategy;

import parkingLotSystem.priceStrategy.PriceStrategy;

public class HourBasedPriceStrategy implements PriceStrategy {
    @Override
    public double price() {
        // 20rs per hours
        return 20;
    }
}
