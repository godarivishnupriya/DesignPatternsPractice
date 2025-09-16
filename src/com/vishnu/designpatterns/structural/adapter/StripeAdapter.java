package com.vishnu.designpatterns.structural.adapter;

public class StripeAdapter implements PaymentProcessor{
    private Stripe stripe;

    public StripeAdapter(Stripe stripe){
        this.stripe = stripe;
    }

    @Override
    public void pay(int amount) {
        stripe.makePayment(amount);
    }
}
