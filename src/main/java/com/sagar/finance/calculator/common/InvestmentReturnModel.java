package com.sagar.finance.calculator.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class InvestmentReturnModel {

    private double totalAmount;

    private double principalAmount;

    private double interestEarned;
}
