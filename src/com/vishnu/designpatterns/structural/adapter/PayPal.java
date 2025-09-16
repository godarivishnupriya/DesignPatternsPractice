package com.vishnu.designpatterns.structural.adapter;

class PayPal {
    public void sendPayment(int cents) {
        System.out.println("Paid " + cents + " cents using PayPal.");
    }
}
