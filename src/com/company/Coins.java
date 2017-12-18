package com.company;

import java.util.Scanner;

public class Coins implements Payment, ReturnChange {
    @Override
    public double takePayment(double cash) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert cash");
        cash = input.nextDouble();
        return cash;
    }

    @Override
    public double returnChange(double cash) {
        System.out.println("Please take your cash " + cash);
        return cash;
    }
}
