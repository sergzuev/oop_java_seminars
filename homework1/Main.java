package homework1;


import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        HotDrinkMachine hotMachine = new HotDrinkMachine();
        ArrayList<Object> finishProd = new ArrayList<>();
        HotDrink hotDrink = new HotDrink();

        hotDrink.setName("coffee");
        hotDrink.setVolume(190);
        hotDrink.setTemperature(85);
        finishProd = hotMachine.getProduct(hotDrink.getName(), hotDrink.getVolume(), hotDrink.getTemperature());
        hotMachine.finishProduct(finishProd);

        hotDrink.setName("tea");
        hotDrink.setVolume(195);
        hotDrink.setTemperature(90);
        finishProd = hotMachine.getProduct(hotDrink.getName(), hotDrink.getVolume(), hotDrink.getTemperature());
        hotMachine.finishProduct(finishProd);
    }
}