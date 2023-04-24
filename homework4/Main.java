package homework4;

// Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться от классов 
//     под каждый тип продукта, заменив единым классом - торговым автоматом

public class Main {
    public static void main(String[] args) {

        HotDrinkMachine<Drink> drink = new HotDrinkMachine<>();
        HotDrinkMachine<HotDrink> hotDrink = new HotDrinkMachine<>();
        drink.setProduct(new Drink("'эспрессо", 200));
        drink.setProduct(new Drink("капучино", 200));
        hotDrink.setProduct(new HotDrink("чай", 250, 85));
        hotDrink.setProduct(new HotDrink("кофе", 200, 80));

        drink.finishProduct();
        hotDrink.finishProduct();
        
    }
}