package dependencyInversion.interfaces;

// Extended interface: Supports both amount and currency
public  interface AdvancedPaymentProcessor extends SimplePaymentProcessor {
    boolean processPayment(double amount, String currency);
}