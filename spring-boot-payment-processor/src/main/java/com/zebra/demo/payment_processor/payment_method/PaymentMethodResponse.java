package com.zebra.demo.payment_processor.payment_method;

public class PaymentMethodResponse {
    // public String id/token;
    public int lastFourDigits;
    public String type;
    public String cardIssuer; // optional?

    public PaymentMethodResponse(PaymentMethod pm) {
        this.lastFourDigits = (int) (pm.getCardNumber() % 10000);
    }
}
