package dependencyInversion.lowLevelModule;

import dependencyInversion.interfaces.AdvancedPaymentProcessor;

// Paypal processor implements AdvancedPaymentProcessor
public class PaypalPaymentProcessor implements AdvancedPaymentProcessor {
    @Override
    public boolean processPayment(double amount, String currency){
        System.out.println("Advanced Payment Processor!");
        System.out.println("Amount is " + amount + " and Currency is " + currency);
        return true;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Basic Payment Processor!");
        System.out.println("Amount is :" + amount);
        return true;
    }
}