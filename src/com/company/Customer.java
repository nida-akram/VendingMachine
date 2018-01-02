package com.company;

import java.util.Scanner;

public class Customer {
    Scanner input = new Scanner(System.in);

    public void options(double cash, String paymentMethod) {
        int drink;
        System.out.println("Please choose drink from the following options:");
        System.out.println(" 1. Coke £1.50\n 2. Coke Zero £2.00\n 3. Fanta £2.35\n 4. Red bull £5.00\n 5. Sprite £3.50");
        drink = input.nextInt();

        Drink choice = new Drink();
        // TODO Need to catch the error from this method call, and somehow keep looping (whilst giving user chance to enter new option)

        VendingMachine money = new VendingMachine();
        money.checkStorage(cash);

        try {
            choice.drinkOptions(drink, cash, paymentMethod);
        }
        catch (Exception e){
            options(cash, paymentMethod);
            return;
        }
    }
}


//TODO make sure I start using ArrayList..
