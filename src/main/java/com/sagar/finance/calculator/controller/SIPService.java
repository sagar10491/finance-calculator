package com.sagar.finance.calculator.controller;

import com.sagar.finance.calculator.common.DepositEntryModel;
import com.sagar.finance.calculator.common.FrequencyEnum;
import com.sagar.finance.calculator.common.InvestmentReturnModel;
import com.sagar.finance.calculator.common.PeriodEnum;
import com.sagar.finance.calculator.common.exception.InvalidInputException;
import org.springframework.stereotype.Service;

@Service
public class SIPService {

     InvestmentReturnModel calculateSIP(DepositEntryModel depositEntryModel) throws InvalidInputException {

        if(depositEntryModel.getInterestFrequency() != FrequencyEnum.MONTHLY){
            throw new InvalidInputException("Only monthly interest frequency is permitted for SIP");
        }

        if(depositEntryModel.getPeriodType() == PeriodEnum.DAYS){
            throw new InvalidInputException("Duration is not permitted in terms of days");
        }

        double interestRate = depositEntryModel.getInterestRate()/100/12;
        long duration = depositEntryModel.getPeriodDuration();
        if(depositEntryModel.getPeriodType() == PeriodEnum.YEARS)
            duration = duration * 12;

        double amount = depositEntryModel.getInvestmentAmount() * Math.pow(1 + interestRate, duration);

        return new InvestmentReturnModel(amount, depositEntryModel.getInvestmentAmount(),
                amount - depositEntryModel.getInvestmentAmount());
    }
}
