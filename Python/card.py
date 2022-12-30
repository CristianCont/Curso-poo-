from payment import Payment

class Card(Payment):
    Number= int
    Cvv= int 
    Data=str
    def __init__(self,id,Number,Cvv,Data):
        super().__init__(id)
        self.Number=Number
        self.Data=Data
        self.Cvv=Cvv
        