package com.vishnu.designpatterns.structural.adapter;

class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    @Override
    public void pay(int amount) {
        // PayPal expects cents, so convert
        int cents = amount * 100;
        paypal.sendPayment(cents);
    }
}