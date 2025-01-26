package dependencyInversion.interfaces;

public interface BankPaymentProcessor {
    boolean processPayment(double amount);
}
