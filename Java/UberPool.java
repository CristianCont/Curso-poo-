class UberPool extends Car {
    String Brand;
    String Model;

    public UberPool(String license, Account driver, String Brand, String Model){
        super(license,driver);
        this.Brand=Brand;
        this.Model=Model;
        
    }

}