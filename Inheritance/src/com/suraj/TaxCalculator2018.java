package com.suraj;

public class TaxCalculator2018 implements TaxCalculator {

    private double taxableIncome;


    public TaxCalculator2018(double taxableIncome) {

        this.taxableIncome = taxableIncome;
    }


    @Override
    public double calculateTax(){ //Used in Interface

    return  taxableIncome * 0.3;
    }
}
