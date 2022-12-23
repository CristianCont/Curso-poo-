from car import Car
from account import Account
if __name__ == "__main__":
    print("Hola mundo")
    car= Car("asd478", Account("Marina","15649"))
    car.Passenger=2
    print(vars(car))
    print(vars(car.Drive))
    


   

