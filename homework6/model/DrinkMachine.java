package homework6.model;

import java.util.ArrayList;
import java.util.List;

import homework6.product.Drink;

public class DrinkMachine implements VendMachine {

    private List<Drink> allProduct = new ArrayList<>();

    @Override
    public void allProduct() {
        for (Drink drink : allProduct) {
            System.out.println(drink);
        }
    }

    @Override
    public void setProduct(Drink product) {
        allProduct.add(product);
    }

}