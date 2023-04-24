package homework6.controller;
/*
 * Добавили контроллер, чтоб разбить связь с общей логикой
 */


import homework6.model.DrinkMachine;
import homework6.product.Drink;

public class UserController {

    private DrinkMachine products = new DrinkMachine();

    public void setProduct(Drink drink) {
        products.setProduct(drink);
    }

    public void allProduct() {
        products.allProduct();
    }

}