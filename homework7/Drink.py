

class Drink:
    
    def __init__(self, name, value):
        self.__name = name
        self.__value = value

    def getName(self):
        return self.__name

    def getValue(self):
        return self.__value

    def __str__(self):
        return f"Напиток: {self.__name}  Объём {self.__value}"