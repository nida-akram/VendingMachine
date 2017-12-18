package com.company;

public class Storage {

    public double availableCash(double cash, double price) {
        System.out.println("Your available balance is £" + (cash - price) + ".");

        return cash - price;
    }
}
