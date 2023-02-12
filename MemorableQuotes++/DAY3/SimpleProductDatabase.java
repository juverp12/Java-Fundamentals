import java.util.ArrayList;

public class SimpleProductDatabase {

        
    public static void main(String [] args){
            ArrayList<String> dynamicArray = new ArrayList<String>();

            dynamicArray.add("Toyota: Php 1,000,000");
            dynamicArray.add("BMW: Php 2,000,000");
            dynamicArray.add("Mazda: Php 4,000,000");
            dynamicArray.add("Ford: Php 3,000,000");

            for(int n=0; n<dynamicArray.size(); n++){
                String[] dynamicArray2 = dynamicArray.get(n).split(": ");
                System.out.println("Product: " +dynamicArray2[0]+" Price: " +dynamicArray2[1]) ;


        }
    }
}
