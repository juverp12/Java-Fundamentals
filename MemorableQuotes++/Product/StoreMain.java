import java.util.ArrayList;

public class StoreMain {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Car("Car1", 20000.0, "Honda", "Civic"));
        products.add(new Car("Car2", 10000.0, "Ford", "Fiesta"));
        products.add(new Laptop("Laptop1", 30000.0, "Asus", 8));
        products.add(new Laptop("Laptop2", 20000.0, "Dell", 16));
        // products.add(new Phone("Phone1", 800.0, "Apple", "iPhone X"));
        // products.add(new Phone("Phone2", 600.0, "Samsung", "Galaxy S10"));


        for(Product product: products){
            if(product instanceof Printable){
                ((Printable) product).print();
            }else{
            System.out.println(product.toString());
            }
        }
        
    }
    
}
