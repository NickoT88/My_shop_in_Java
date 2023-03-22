package ru.yandex.praktikum.myshop.model;

import static ru.yandex.praktikum.myshop.model.constants.Colour.RED;
import static ru.yandex.praktikum.myshop.model.constants.Discount.GET_DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super.amount = amount;
        super.price = price;
        this.colour=colour;
        super.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
        if (colour.equals (RED)) {
            return GET_DISCOUNT;
        }
        return 0;
    }

}