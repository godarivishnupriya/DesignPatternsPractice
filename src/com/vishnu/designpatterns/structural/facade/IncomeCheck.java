package com.vishnu.designpatterns.structural.facade;

class IncomeCheck {
    boolean hasSufficientIncome(String customer) {
        System.out.println("Checking income for " + customer);
        return true;
    }
}
