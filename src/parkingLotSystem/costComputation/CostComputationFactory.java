package parkingLotSystem.costComputation;

import parkingLotSystem.VehicleType;
import parkingLotSystem.priceStrategy.PriceStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CostComputationFactory {

    private Map<Enum, Supplier<? extends CostComputation>> costComputationRegistry = new HashMap<>();
    PriceStrategy priceStrategy;
    public CostComputationFactory(PriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
        initializeRegistry();
    }

    private void initializeRegistry() {
//        costComputationRegistry.put(VehicleType.two_wheel_vehicle, TwoWheelCostComputation.class);
//        costComputationRegistry.put(VehicleType.four_wheel_vehicle, FourWheelCostComputation.class);
        costComputationRegistry.put(VehicleType.two_wheel_vehicle, () -> new TwoWheelCostComputation(priceStrategy));
        costComputationRegistry.put(VehicleType.four_wheel_vehicle, () -> new FourWheelCostComputation(priceStrategy));
    }

    public CostComputation getCostComputation(Enum vehicleType){
        System.out.println("vehicleType " + vehicleType);
        Supplier<? extends CostComputation> costComputation = costComputationRegistry.get(vehicleType);
        if(costComputation == null){
            throw new IllegalArgumentException("Vehicle not allowed!");
        }

        try {
//            System.out.println("Object" + costComputation.getDeclaredConstructor().newInstance());
//            return costComputation.getDeclaredConstructor().newInstance();
            return costComputation.get();
        } catch (Exception e){
            throw new RuntimeException("Error caught while calculating parking price!\nError message: " + e);
        }
    }
}
