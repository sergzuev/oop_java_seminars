from Drink import Drink


class MineralWater(Drink):

    def __init__(self, name, value, status):
        # super().__init__(name, value)
        self.__name = name
        self.__value = value
        self.__status = status

    def getstatus(self):
        return self.__status

    def setstatus(self, status):
        self.__status = status

    def __str__(self):
        return f"Название: {self.__name}  Объём: {self.__value}  свойства: {self.__status}"