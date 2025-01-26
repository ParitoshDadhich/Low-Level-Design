package dependencyInversion.lowLevelModule;

import dependencyInversion.interfaces.AdvancedPaymentProcessor;

public class CreditCardPaymentProcessor implements AdvancedPaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Basic Payment Processor!");
        System.out.println("Amount is " + amount);
        return false;
    }

    @Override
    public boolean processPayment(double amount, String currency) {
        System.out.println("Advanced Payment Processor!");
        System.out.println("Amount is " + amount + " currency is " + currency);
        return true;
    }
}
