package com.sagar.finance.calculator.controller;


import com.sagar.finance.calculator.common.DepositEntryModel;
import com.sagar.finance.calculator.common.FrequencyEnum;
import com.sagar.finance.calculator.common.InvestmentReturnModel;
import com.sagar.finance.calculator.common.PeriodEnum;
import com.sagar.finance.calculator.common.exception.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SIPCalculationController {

    @Autowired
    private SIPService sipService;

    @PostMapping("/sip")
    public InvestmentReturnModel calculateSIP(@RequestBody DepositEntryModel depositEntry)  throws InvalidInputException {
        return sipService.calculateSIP(depositEntry);
    }
}

