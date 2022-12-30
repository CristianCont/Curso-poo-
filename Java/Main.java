class Main{
    
    public static void main(String[] args) {
        UberX uberx = new UberX("Lam123",new Account("Juancho","1013691786" ),"Chevrolet","Corsa");
        uberx.setPassenger(4);
        uberx.printDataCar();
       
        /*Car car2= new Car("ayt123",new Account("Manuel", "1478947"));
        car2.Passenger=2;
        car2.printDataCar();
        */
        UberVan ubervan = new UberVan("Lam123",new Account("Juancho","1013691786"),null,null);
        ubervan.setPassenger(6);
        ubervan.printDataCar();
        
    }

}