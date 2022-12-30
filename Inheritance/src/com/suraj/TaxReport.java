package com.suraj;

public class TaxReport {

    private TaxCalculator calculator;

//   public TaxReport(TaxCalculator calculator){  //this is working with Interface
//       this.calculator = calculator;
// }

    public void show(TaxCalculator calculator){
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }


//    public void setCalculator(TaxCalculator calculator) { // inject a dependency
//        this.calculator = calculator;
//    }


}
