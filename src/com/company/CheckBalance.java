package com.company;

import java.util.Scanner;

public class CheckBalance {

    public void enoughCash(String drinkName, double cash, double price, String paymentMethod) {
        Scanner input = new Scanner(System.in);

        if (cash > price || paymentMethod.equals("Card")) {
            System.out.println("Here is your " + drinkName);
            Storage left = new Storage();
            cash = left.availableCash(cash, price);
            System.out.println("Would you like to make another selection?\n 1.Yes\n 2.No");
            int choice = input.nextInt();
            multipleDrinks(choice);

            if (multipleDrinks(choice) == true) {
                Customer customer = new Customer();
                customer.options(cash, paymentMethod);
            }
            else {
                if (paymentMethod.equals("Coins")) {
                    Coins change = new Coins();
                    change.returnChange(cash);
                }

                else if (paymentMethod.equals("Card")) {
                    Card card = new Card();
                    card.payment(cash);
                }
            }
        }
    }

    public boolean multipleDrinks(int choice) {
        if (choice == 1) {
            return true;
        }
        return false;
    }
}
