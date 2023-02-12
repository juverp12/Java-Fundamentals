import java.util.Scanner;

public class StaticArray2 {

    public static void main(String [] args){
         Scanner input = new Scanner(System.in);
         System.out.println("\nChoose and type one of the following:");
         System.out.print(" | normal |  reverse |\n");
         String output = input.nextLine();

        String [] strings;
        strings = new String []{
            "First String",
            "Second String",
            "Third String",
            "Fourth String" 
        };
        switch(output){

            case "normal":
            for(int n=0; n<strings.length; n++)
                System.out.println(strings[n]);
            break;

            case "reverse":
            for(int n=strings.length-1; n>=0; n--)
                System.out.println(strings[n]);
            break;

            default:
            System.out.println("Incorrect Input!");
            break;
        }
        input.close();
    }
}
