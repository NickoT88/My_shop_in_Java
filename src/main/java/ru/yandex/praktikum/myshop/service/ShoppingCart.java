package ru.yandex.praktikum.myshop.service;

import ru.yandex.praktikum.myshop.model.Food;

public class ShoppingCart {

    private Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < food.length; i++) {
            totalPrice = totalPrice + food[i].getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < food.length; i++) {
            totalPrice = totalPrice + food[i].getTotalPriceWithDiscount();
        }
        return totalPrice;
    }

    public double getTotalPriceIsVegetarian() {
        double totalPrice = 0;
        for (int i = 0; i < food.length; i++) {
            totalPrice = totalPrice + food[i].getTotalPriceIsVegetarian();
        }
        return totalPrice;
    }

}


