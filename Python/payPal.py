from payment import Payment

class Paypal(Payment):
    Email= str
    def __init__(self,id,Email):
        super().__init__(id)
        self.Email=Email
        