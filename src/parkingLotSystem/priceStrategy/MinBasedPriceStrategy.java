package parkingLotSystem.priceStrategy;

import parkingLotSystem.priceStrategy.PriceStrategy;

public class MinBasedPriceStrategy implements PriceStrategy {
    @Override
    public double price() {
        // 0.5 rs per min
        return 0.5;
    }
}
