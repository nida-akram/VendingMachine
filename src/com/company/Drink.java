package com.company;

import java.util.HashMap;

public class Drink {

    public double drinkOptions(int drinkChoice, double cash, String paymentMethod) throws Exception {
        double price;

        CheckBalance balance = new CheckBalance();

        HashMap<String, Double> drinkPrices = new HashMap<>();

        drinkPrices.put("Coke", 1.50);
        drinkPrices.put("Coke Zero", 2.00);
        drinkPrices.put("Fanta", 2.35);
        drinkPrices.put("Red bull", 5.00);
        drinkPrices.put("Sprite", 3.50);


        switch (drinkChoice) {
            case 1:
                price = drinkPrices.get("Coke");
                balance.enoughCash("Coke", cash, price, paymentMethod);
                break;

            case 2:
                price = drinkPrices.get("Coke Zero");
                balance.enoughCash("Coke Zero", cash, price, paymentMethod);
                break;

            case 3:
                price = drinkPrices.get("Fanta");
                balance.enoughCash("Fanta", cash, price, paymentMethod);
                break;

            case 4:
                price = drinkPrices.get("Red bull");
                balance.enoughCash("Red bull", cash, price, paymentMethod);
                break;

            case 5:
                price = drinkPrices.get("Sprite");
                balance.enoughCash("Sprite", cash, price, paymentMethod);
                break;

            default:
                System.out.println("Please enter a correct number");
                throw new Exception();
        }
        return price;
    }

}