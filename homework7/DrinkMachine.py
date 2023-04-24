from VendMachine import VendMachine
from Drink import Drink


class DrinkMachine(VendMachine):

    def __init__(self):
        super().__init__()
        self.__allProducts = list()

    
    def setProduct(self, product):
        if isinstance(product, Drink):
            self.__allProducts.append(product)

    def allProduct(self):
        for drink in self.__allProducts:
            print(drink)
          