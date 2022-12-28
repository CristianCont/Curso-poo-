class UberX extends Car {
    String Brand;
    String Model;

    public UberX(String license, Account driver, String Brand, String Model){
        super(license,driver);
        this.Brand=Brand;
        this.Model=Model;
        
    }

}