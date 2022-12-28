from car import Car
class UberPool(Car):
    Brand= str
    Model= str
    def __init__(self, license, Drive,Brand,Model):
        super().__init__(license, Drive)
        self.Brand=Brand
        self.Model=Model
