package com.company;

import java.util.Scanner;

public class Card implements Payment {
   @Override
    public double takePayment(double cash) {
       Scanner input = new Scanner(System.in);

       int pin;
       double deposit = 0;

       System.out.println("Please choose your drink first to get the total!");
       Customer drinks = new Customer();
       drinks.options(cash);

       System.out.println("Please insert card!");
       System.out.println("Please enter your pin");
       pin = input.nextInt();

       if (pin == 1234) {
           System.out.println("How much would you like to deposit?");
           deposit = input.nextDouble();
       }
       else {
           System.out.println("Pin incorrect, please try again!");
           takePayment(cash);
       }

       return deposit;
   }
}
