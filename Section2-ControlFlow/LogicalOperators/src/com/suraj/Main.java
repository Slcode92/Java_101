package com.suraj;

public class Main {

    public static void main(String[] args) {
	    int temperture = 22;
	    boolean isWarm = temperture>20 && temperture < 30;
            System.out.println(isWarm);


        boolean hasHighIncome = false;
        boolean hadGoodCredit = true;
        boolean hasCriminalRecords = false;
        boolean isEligible= (hasHighIncome || hasHighIncome) && !hasCriminalRecords;
        System.out.println(isEligible);

    }
}
