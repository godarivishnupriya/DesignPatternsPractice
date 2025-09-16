package com.vishnu.designpatterns.structural.facade;

class LoanFacade {
    private CreditCheck credit;
    private IncomeCheck income;
    private CollateralCheck collateral;

    public LoanFacade() {
        this.credit = new CreditCheck();
        this.income = new IncomeCheck();
        this.collateral = new CollateralCheck();
    }

    /** through this method we are able to hide complex services */
    public boolean isEligible(String customer) {
        System.out.println("Evaluating loan eligibility for " + customer);

        return credit.hasGoodCredit(customer) &&
                income.hasSufficientIncome(customer) &&
                collateral.hasCollateral(customer);
    }
}

