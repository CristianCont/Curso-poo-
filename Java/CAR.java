public class Car {
    private Integer id;
    private String license;
    private Account Drive;
    protected Integer Passenger;

    public Car(String license,Account Drive){
        this.license=license;
        this.Drive=Drive;

      
    }


    void printDataCar(){
        if(Passenger != null){
            System.out.println("License: "+license+ " Drive: "+ Drive.name +" Passenger "+ Passenger);
        }
    }
    public Integer getPassenger(){
        return Passenger;

    }
    public void setPassenger(Integer Passenger){
        if(Passenger==4){
            this.Passenger=Passenger;

        }
        else{
            System.out.println("Disponiviliad de cuatro pasajeros cuatro pasajeros");
        }

    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getLicense() {
        return license;
    }


    public void setLicense(String license) {
        this.license = license;
    }


    public Account getDrive() {
        return Drive;
    }


    public void setDrive(Account drive) {
        Drive = drive;
    }
    
}

