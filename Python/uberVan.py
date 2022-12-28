from car import Car
class Ubervan(Car):
    TypeCarAcceptrd= []
    SeatsMaterial=[]
    def __init__(self, license, Drive,TypeCarAcceptrd,SeatsMaterial):
        super().__init__(license, Drive)
        self.TypeCarAcceptrd=TypeCarAcceptrd
        self.SeatsMaterial=SeatsMaterial
