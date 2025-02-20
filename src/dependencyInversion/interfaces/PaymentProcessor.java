// Abstraction: PaymentProcessor Interface with overloaded methods
public interface PaymentProcessor {
    // With currency
    boolean processPayment(double amount, String currency);

    // Without currency (default to a specific currency, e.g., USD)
    boolean processPayment(double amount);
}