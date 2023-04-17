package homework1;

import java.util.ArrayList;
/*
* Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
* Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат 
*  и реализовать перегруженный метод getProduct(int name, int volume, int temperature) 
*  выдающий продукт соответствующий имени, объему и температуре.
* В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат 
*  и воспроизвести логику заложенную в программе.
* Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
*/

public class HotDrinkMachine implements VendMachine {
    
    
    @Override
    public void finishProduct(ArrayList<Object> product) {
        System.out.println(product);
    }

    public ArrayList<Object> getProduct(String name, int volume, int temperature) {
        ArrayList<Object> finishProd = new ArrayList<>();
        finishProd.add(name);
        finishProd.add(volume);
        finishProd.add(temperature);
        return finishProd;
                
    }

}