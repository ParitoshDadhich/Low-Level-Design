package dependencyInversion.highLevelModule;

import dependencyInversion.interfaces.AdvancedPaymentProcessor;
import dependencyInversion.lowLevelModule.TraditionalPaymentProcessor;

// depends upon PaymentProcessor.java abstraction
public class CheckoutService {
    private AdvancedPaymentProcessor advancedPaymentProcessor;
    private TraditionalPaymentProcessor traditionalPaymentProcessor;

    public CheckoutService(AdvancedPaymentProcessor advancedPaymentProcessor, TraditionalPaymentProcessor traditionalPaymentProcessor){
        this.advancedPaymentProcessor = advancedPaymentProcessor;
        this.traditionalPaymentProcessor = traditionalPaymentProcessor;
    }

    // checkout with advanced payment processor
    public void checkoutAdvanced(double amount, String currency){
        System.out.println("Starting checkout process");
        boolean status = advancedPaymentProcessor.processPayment(amount, currency);

        if(status){
            System.out.println("Advanced payment successfully Completed!");
        } else {
            System.out.println("Advanced payment failed!");
        }
    }

    // checkout with basic payment processor
    public void checkoutBasic(double amount){
        System.out.println("Starting checkout process");
        boolean status = advancedPaymentProcessor.processPayment(amount);

        if(status){
            System.out.println("Simple payment successfully Completed!");
        } else {
            System.out.println("Simple payment failed!");
        }
    }

    // checkout traditional i.e. using bank
    public void checkoutTraditional(double amount){
        System.out.println("Starting checkout process");
        boolean status = traditionalPaymentProcessor.processPayment(amount);

        if(status){
            System.out.println("Traditional payment successfully Completed!");
        } else {
            System.out.println("Simple payment failed!");
        }
    }
}
