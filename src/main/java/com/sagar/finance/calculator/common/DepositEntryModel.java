package com.sagar.finance.calculator.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class DepositEntryModel {

    private FrequencyEnum interestFrequency;

    private long investmentAmount;

    private PeriodEnum periodType;

    private long periodDuration;

    private double interestRate;
}
