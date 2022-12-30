class UberX extends Car {
    String Brand;
    String Model;

    public UberX(String license, Account driver, String Brand, String Model){
        super(license,driver);
        this.Brand=Brand;
        this.Model=Model;
        
    }
    @Override
    void printDataCar() {
        // TODO Auto-generated method stub
        super.printDataCar();
        System.out.println("Brand: "+Brand +" Model: "+ Model);
    }

}