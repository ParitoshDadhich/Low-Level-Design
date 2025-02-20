package dependencyInversion.main;

import dependencyInversion.highLevelModule.CheckoutService;
import dependencyInversion.interfaces.AdvancedPaymentProcessor;
import dependencyInversion.lowLevelModule.CreditCardPaymentProcessor;
import dependencyInversion.lowLevelModule.PaypalPaymentProcessor;
import dependencyInversion.lowLevelModule.TraditionalPaymentProcessor;

/*
IN this impl we learnt its always better when both high level module and low level module dependends on Abstraction.
This can be implemented using dependency inversion desin principle.

Why This Design Works:
Single CheckoutService: You don’t need to create separate checkout services for different payment methods. A single CheckoutService can handle multiple payment types by accepting different processors.

Extensibility: If you want to add more payment methods in the future (like CryptoPaymentProcessor), you can easily extend the CheckoutService to include those without significant changes to existing code.

Separation of Concerns: Each payment processor (bank, PayPal, credit card) has its own implementation, keeping the design modular and easy to maintain.

Flexibility: The system can handle various payment methods, providing flexibility in how payments are processed without complicating the structure.


https://chatgpt.com/c/670d57dd-e448-800d-83d1-adfe0725aa6c
(BAD PRACTICE)Use the above link for under standing how can I implemnt when low level module depends on high level module
 */


/*
Explanation of SOLID Principles Applied:
Single Responsibility Principle (SRP):

Each payment processor class (like PayPalPaymentProcessor, BankPaymentProcessorImpl, etc.) has a single responsibility: to process payments.
The CheckoutService handles the checkout process.
Open/Closed Principle (OCP):

The system can be easily extended by adding new payment processors (like CryptoPaymentProcessor) without modifying existing code.
Liskov Substitution Principle (LSP):

Any class implementing AdvancedPaymentProcessor can replace another without affecting the functionality of the CheckoutService. For example, CreditCardPaymentProcessor can be used interchangeably with PayPalPaymentProcessor.
Interface Segregation Principle (ISP):

Instead of a single interface with many methods, we have specific interfaces (SimplePaymentProcessor, AdvancedPaymentProcessor, and BankPaymentProcessor) that cater to the needs of different payment processing types.
Dependency Inversion Principle (DIP):

The CheckoutService depends on abstractions (interfaces) rather than concrete implementations. This makes it easier to switch payment processors without changing the checkout logic.
Conclusion:
This code implementation demonstrates how to effectively apply the SOLID principles in a payment processing scenario. Each principle contributes to a design that is clean, maintainable, and extensible, enabling you to add new payment methods or modify existing ones with minimal effort.
 */
public class Driver {
    public static void main(String[] args) {
        // Checkout service Using PayPal payment processor
        AdvancedPaymentProcessor advancedPaymentProcessor = new PaypalPaymentProcessor();
        TraditionalPaymentProcessor traditionalPaymentProcessor = new TraditionalPaymentProcessor();
        CreditCardPaymentProcessor creditCardProcessor = new CreditCardPaymentProcessor();

        CheckoutService checkoutService = new CheckoutService(advancedPaymentProcessor, traditionalPaymentProcessor);

        // advanced payment service
        System.out.println("Paypal Payment Processor");
        checkoutService.checkoutAdvanced(100.00, "USD");
        System.out.println("\n********************\n");

        // simple payement service
        System.out.println("Simple Payment Processor");
        checkoutService.checkoutBasic(1000.0);
        System.out.println("\n********************\n");

        // traditional payment service using bank
        System.out.println("Banking Payment Processor");
        checkoutService.checkoutTraditional(10000.0);

        System.out.println("\n********************\n");
        // Create a new checkout service for credit card payments
        CheckoutService creditCardService = new CheckoutService(creditCardProcessor, traditionalPaymentProcessor);
        System.out.println("Credit Card Payment Processor");
        creditCardService.checkoutAdvanced(150000.0, "USD");

    }
}
