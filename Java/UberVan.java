import java.util.ArrayList;
import java.util.Map;
class UberVan extends Car {
     Map<String, Map<String, Integer>> typeCarAccepted;
     ArrayList<String> seatsMaterial;

     
  
    public UberVan(String license, Account driver,Map<String, Map<String, Integer>> typeCarAccepte,ArrayList<String> seatsMaterial ){
        super(license, driver);
        this.typeCarAccepted=typeCarAccepte;
        this.seatsMaterial=seatsMaterial;
    }
  @Override
  public void setPassenger(Integer Passenger) {
    if(Passenger==6){
        this.Passenger=Passenger;

    }
    else{
        System.out.println("UberVan es de disponibilidad 6 pasajeros");
    }
  }

    
}