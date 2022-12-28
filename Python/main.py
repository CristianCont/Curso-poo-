from car import Car
from account import Account
from uberX import UberX
if __name__ == "__main__":
    print("Hola mundo")
    car= Car("asd478", Account("Marina","15649"))
    car.Passenger=2
    print(vars(car))
    print(vars(car.Drive))
    Ubex=UberX("adf545", Account("Ichigo","16849489"),"BmW","i8")
    Ubex.Passenger=5
    print(vars(Ubex))
    


   

