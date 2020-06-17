package com.sagar.finance.calculator.common;

public enum PeriodEnum {
    DAYS(365), MONTHS(12), YEARS(1);

    private int denomination;

    PeriodEnum(int denomination) {
        this.denomination = denomination;
    }

    public int getYearDenomination(){
        return  denomination;
    }
}
