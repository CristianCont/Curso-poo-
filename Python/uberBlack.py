from car import Car
class UberBlack(Car):
    TypeCarAcceptrd= []
    SeatsMaterial=[]
    def __init__(self, license, Drive,TypeCarAcceptrd,SeatsMaterial):
        super().__init__(license, Drive)
        self.TypeCarAcceptrd=TypeCarAcceptrd
        self.SeatsMaterial=SeatsMaterial
