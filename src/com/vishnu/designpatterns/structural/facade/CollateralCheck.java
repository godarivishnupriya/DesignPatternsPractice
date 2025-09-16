package com.vishnu.designpatterns.structural.facade;

class CollateralCheck {
    boolean hasCollateral(String customer) {
        System.out.println("Checking collateral for " + customer);
        return true;
    }
}