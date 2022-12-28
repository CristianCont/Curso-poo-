import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car {
   Map<String, ArrayList<String,Integer>> TypecarAccepted;
    ArrayList<String> seatsMaterial;

    public UberBlack(String license, Account driver, Map<String, ArrayList<String,Integer>> TypecarAccepted, 
    ArrayList<String>seatsMaterial){
        super(license, driver);
        this.TypecarAccepted=TypecarAccepted;
        this.seatsMaterial=seatsMaterial;

    }
    
}
