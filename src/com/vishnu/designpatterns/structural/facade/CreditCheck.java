package com.vishnu.designpatterns.structural.facade;

class CreditCheck {
    boolean hasGoodCredit(String customer) {
        System.out.println("Checking credit for " + customer);
        return true;
    }
}


