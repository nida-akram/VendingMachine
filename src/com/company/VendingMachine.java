package com.company;

import java.util.Scanner;

public class VendingMachine {


    public static void main(String[] args) {
        Scanner insert = new Scanner(System.in);

        double price = 0;
        int paymentType;
        double cash=0;

        Storage store = new Storage();
        store.availableCash(cash, price);

        System.out.println("Please choose from the options; Card or Cash!\n 1. Card\n 2. Cash");
        System.out.println("WARNING: No change will be given if you pay by card!!");
        paymentType = insert.nextInt();

        if (paymentType == 1) {
            Card card = new Card();
            cash = card.takePayment(cash);
        }
        else if (paymentType == 2) {
            Coins coins = new Coins();
            cash = coins.takePayment(cash);
        }

        else {
            System.out.println("Please choose the right number!");
        }

        Customer input = new Customer();
        input.options(cash);
    }

    public double checkStorage(double cash) {
        return cash;
    }
}
