from Drink import Drink


class HotDrink(Drink):
    def __init__(self, name, value, temperature):
        # super().__init__(name, value)
        self.__name = name
        self.__value = value
        self.__temperature = temperature
        
    def getname(self):
        return self.__name
    
    def setname(self, name):
        self.__name = name
        
    def getvalue(self):
        return self.__value
    
    def setvalue(self, value):
        self.__value = value
        
    def getTemperature(self):
        return self.__temperature
    
    def setTemperature(self, temperature):
        self.__temperature = temperature
        
    def __str__(self):
        return f"Название: {self.__name}  Объём: {self.__value}  Температура: {self.__temperature}"
        