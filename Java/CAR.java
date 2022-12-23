public class Car {
    Integer id;
    String license;
    Account Drive;
    Integer Passenger;

    public Car(String license,Account Drive){
        this.license=license;
        this.Drive=Drive;
    }


    void printDataCar(){
        System.out.println("License: "+license+ " Drive: "+ Drive.name );
    }
}

