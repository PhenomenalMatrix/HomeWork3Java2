package com.company;

public class LimitExeption extends Exception {
    public static double remainingAmount;


    public LimitExeption(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }


    public static double getRemainingAmount() {
        System.out.println("snyato "+ remainingAmount);
        remainingAmount = BankAccout.getAmount() - remainingAmount;
        return remainingAmount;
    }
}
