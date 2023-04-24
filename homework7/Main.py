from Drink import Drink
from HotDrink import HotDrink
from MineralWater import MineralWater
from DrinkMachine import DrinkMachine

class Main:
        
    controller = DrinkMachine()

    drink = Drink("тархун", 200)
    hot_drink = HotDrink("кофе", 200, 85)
    mineral = MineralWater("Горячий ключ", 300, "не газированная")

    controller.setProduct(Drink("буратино", 500))
    controller.setProduct(drink)

    controller.setProduct(hot_drink)
    controller.setProduct(mineral)

    controller.allProduct()