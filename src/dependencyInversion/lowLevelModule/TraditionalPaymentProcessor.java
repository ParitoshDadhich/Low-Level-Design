package dependencyInversion.lowLevelModule;

import dependencyInversion.interfaces.BankPaymentProcessor;

public class TraditionalPaymentProcessor implements BankPaymentProcessor {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Traditional Payment Processor!");
        return true;
    }
}
