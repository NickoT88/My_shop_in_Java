package ru.yandex.praktikum.myshop.model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    @Override
    public double getDiscount() {
        return 0;
    }

    public double getTotalPrice() {
        return price * amount;
    }

    public double getTotalPriceWithDiscount() {
        if (getDiscount() == 0) {
            return getTotalPrice();
        }
        return getTotalPrice() - (getDiscount() / 100 * getTotalPrice());
    }

    public double getTotalPriceIsVegetarian() {

        if (isVegetarian) {
            return getTotalPrice();
        }
        return 0;
    }
}
