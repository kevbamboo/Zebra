package com.zebra.demo.payment_processor.payment_method;

public class CreatePaymentMethodRequest {
    private long cardNumber;
    private int expMonth;
    private int expYear;
    private int cvv;

    public CreatePaymentMethodRequest(long cardNumber, int expMonth, int expYear, int cvv) {
        this.cardNumber = cardNumber;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cvv = cvv;
    }

    public long getCardNumber() {
        return this.cardNumber;
    }

    public int getExpMonth() {
        return this.expMonth;
    }

    public int getExpYear() {
        return this.expYear;
    }

    public int getCvv() {
        return this.cvv;
    }
}
