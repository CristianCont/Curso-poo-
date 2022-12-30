class PayPal extends Payment{
    String Email;
   

    public PayPal(Integer id,String Email){
        super(id);
        this.Email=Email;
    }
}

