package com.vishnu.designpatterns.structural.adapter;

class Stripe {
    public void makePayment(int dollars) {
        System.out.println("Paid " + dollars + " USD using Stripe.");
    }
}
