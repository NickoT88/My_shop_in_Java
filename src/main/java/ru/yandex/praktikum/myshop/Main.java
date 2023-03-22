package ru.yandex.praktikum.myshop;

import ru.yandex.praktikum.myshop.model.Apple;
import ru.yandex.praktikum.myshop.model.Food;
import ru.yandex.praktikum.myshop.model.Meat;
import ru.yandex.praktikum.myshop.service.ShoppingCart;

import static ru.yandex.praktikum.myshop.model.constants.Colour.GREEN;
import static ru.yandex.praktikum.myshop.model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {

        Food[] food = {
                new Meat(5, 100),
                new Apple(10, 50, RED),
                new Apple(8, 60, GREEN),
        };

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println("Общая сумма товаров без скидки:  " + shoppingCart.getTotalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getTotalPriceIsVegetarian());
    }
}
