package homework6.view;

import homework6.controller.UserController;
import homework6.product.Drink;
import homework6.product.HotDrink;
import homework6.product.MineralWater;

// Возьмем реализованный код в рамках семинара 4 и продемонстрируем применение принципов, 
//    усвоенных на семинаре. В проекте прокомментируем участки кода, 
//    которые рефакторим и какой принцип применяем и почему

public class Main {
    /*
     * Разобьем структуру по пакетам
     * Добавим контроллер
     * Main теперь обращается только к одному классу UserController без доступа к основной логике
     * Теперь можно добавлять новые продукты не меняя всей логики
     */

    public static void main(String[] args) {
        
        UserController user = new UserController();
        user.setProduct(new Drink("компот", 250));
        user.setProduct(new Drink("тархун", 200));
        user.setProduct(new MineralWater("Горячий ключ", "не газированная", 500));
        user.setProduct(new MineralWater("Ессентуки", "газированная", 500));
        user.setProduct(new HotDrink("чай", 300, 65));
        user.setProduct(new HotDrink("кофе", 200, 80));

        user.allProduct();
    }
}