import java.util.ArrayList;

public class CoffeeShop {

    public static void main(String[] args) {
        Beverage beverage1 = new Beverage("Iced Tea", 299, "Venti", "Juice Based");
        Beverage beverage2 = new Beverage("Hot Cocoa", 349, "Tall", "Creme Based");
        Beverage beverage3 = new Beverage("Latte", 399, "Grande", "Coffee Based");


        Pastry pastry1 = new Pastry("Savory Danish", 349, "Savory");
        Pastry pastry2 = new Pastry("Muffin", 299, "Sweet");
        Pastry pastry3 = new Pastry("Croissant", 249, "Sweet");


        ArrayList<Beverage> orderBeverages= new ArrayList<>();
        orderBeverages.add(beverage1);
        orderBeverages.add(beverage2);
        orderBeverages.add(beverage3);

        ArrayList<Pastry> orderPastries= new ArrayList<>();
        orderPastries.add(pastry1);
        orderPastries.add(pastry2);
        orderPastries.add(pastry3);

        long totalPrice = 0;

        System.out.println("Beverage: ");
            for(Beverage bevarageorder: orderBeverages){
                System.out.println("--"+bevarageorder.getproductName() +": $"+ (bevarageorder.getPrice() / 100.0 ));
                totalPrice+= bevarageorder.getPrice();
            }
        System.out.println("Pastries: ");
            for(Pastry pastryorder: orderPastries){
                System.out.println("--"+pastryorder.getproductName() +": $"+ (pastryorder.getPrice() / 100.0 ));
                totalPrice+=pastryorder.getPrice();
            }
            System.out.println("Total Price is: $"+(totalPrice) / 100.0);
    }
    
}
