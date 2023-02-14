public class Shoes extends Product{
    

    private String brand;
    private String type;

    public Shoes(String name, double price, String brand, String type){
        super(name, price);
        this.brand=brand;
        this.type=type;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type=type;
    }
    @Override
        public String toString(){
            return"Shoe: Name= "+getName()+ ", Price= "+getPrice()+ ", Brand= "+getBrand()+ ", Type= "+getType();
        }
}
