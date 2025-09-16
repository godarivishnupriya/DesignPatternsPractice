package com.vishnu.designpatterns.structural.facade;

public class LoanClient {
    public static void main(String[] args) {
        LoanFacade loanFacade = new LoanFacade();
        if (loanFacade.isEligible("Vishnupriya")) {
            System.out.println("Loan approved!");
        } else {
            System.out.println("Loan denied!");
        }
    }
}

