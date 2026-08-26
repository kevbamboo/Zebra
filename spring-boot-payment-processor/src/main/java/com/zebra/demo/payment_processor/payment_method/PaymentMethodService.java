package com.zebra.demo.payment_processor.payment_method;

import com.zebra.demo.payment_processor.vault.VaultService;

public class PaymentMethodService {
    VaultService vaultService;

    public PaymentMethodService(VaultService vaultService) {
        this.vaultService = vaultService;
    }

    public PaymentMethodResponse createPaymentMethod(CreatePaymentMethodRequest request) {
        PaymentMethod pm = new PaymentMethod(request.getCardNumber(), request.getExpMonth(), request.getExpYear(),
                request.getCvv());

        // check validity with vault
        vaultService.getId(pm);
        // PaymentMethodResponse pmResponse = new PaymentMethodResponse();
        // make payment method
        // turn into response (make token/id? + last 4 digits? + type + card issuer /
        // bank?)
        return null;
    }
}
