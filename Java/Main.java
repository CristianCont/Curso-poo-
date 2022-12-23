class Main{
    
    public static void main(String[] args) {
        Car car = new Car("Lam123",new Account("Juancho","1013691786" ));
        car.Passenger=4;
        car.printDataCar();
        
        Car car2= new Car("ayt123",new Account("Manuel", "1478947"));
        car2.Passenger=2;
        car2.printDataCar();
        
    }

}