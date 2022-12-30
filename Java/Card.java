class Card extends Payment{
    String Number;
    Integer Cvv;
    String Data;

    public Card(Integer id,
    String Number,Integer Cvv,String Data){
        super(id);
        this.Number=Number;
        this.Cvv=Cvv;
        this.Data=Data;
        
    }
}
