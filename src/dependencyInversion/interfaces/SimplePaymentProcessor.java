package dependencyInversion.interfaces;

// Base interface: Only supports amount
public  interface SimplePaymentProcessor {
    boolean processPayment(double amount);
}