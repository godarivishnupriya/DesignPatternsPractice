package com.vishnu.designpatterns.structural.adapter;

public class PaymentAdapterDemo {
    public static void main(String[] args) {
        // Using Stripe
        PaymentProcessor stripePayment = new StripeAdapter(new Stripe());
        stripePayment.pay(50); // 50 dollars

        // Using PayPal
        PaymentProcessor paypalPayment = new PayPalAdapter(new PayPal());
        paypalPayment.pay(75); // 75 dollars
    }
}

