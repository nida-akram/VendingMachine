package com.company;

import java.util.Scanner;

public class Card implements Payment {
   @Override
    public double takePayment(double cash, String paymentMethod) {
       Scanner input = new Scanner(System.in);

       int pin;
       double deposit = 0;

       System.out.println("Please insert card!");
       System.out.println("Please enter your pin");
       pin = input.nextInt();

       if (pin != 1234) {
           System.out.println("Pin incorrect, please try again!");
           takePayment(cash, paymentMethod);
       }
       return deposit;
   }

   double payment(double cash){
       System.out.println("Your total amount is " + cash);
       return cash;
    }
}
