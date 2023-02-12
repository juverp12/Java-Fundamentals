import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    int num1, num2, total;
        Scanner scan = new Scanner(System.in);

   
        System.out.println("Hello World! ");
 /* 
        
        System.out.print("Enter 1st number: ");
        num1 = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = scan.nextInt();
        total = num1+num2;
        System.out.println("The total number is: "+total);

        for(int x=1; x<=10; x++){
            System.out.println(x);

        }
        */
        String[] strings ={
            " First string"," Second string"," Third string"

        };
        for(int index= strings.length-1; index>=0; index--)
                System.out.println(strings[index]);
    }
}
