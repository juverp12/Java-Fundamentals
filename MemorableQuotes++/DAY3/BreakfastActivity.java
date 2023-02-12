import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class BreakfastActivity {

  static Scanner name = new Scanner(System.in);

  public static void main(String[] args) {
    
  

    ArrayList<String> programming = new ArrayList<String>();
    programming.add("Python");
    programming.add("Java");
    programming.add("Javascript");
    programming.add("C++");
    programming.add("Kotlin");
    programming.add("Swift");
    programming.add("Kotlin");
    programming.add("C#");
  
    
    boolean endfunction = true;
    while (endfunction){
      
      System.out.println("\n Choose and type one of the following:");
      System.out.print(" display |  ascending | descending | count  | search | dsearch\n");
      System.out.print("Type here:");
      String code = name.nextLine();  

      switch(code){
          case "display":
            System.out.println(" <----Display----> ");
            for(String i: programming){
                System.out.println(i);
            }
          break;

          case "ascending":
            System.out.println(" <----Sort Ascending----> ");
            Collections.sort(programming);
            for(String i: programming){
              System.out.println(i);
          }
          break;
          
          case "descending":
            System.out.println(" <----Sort Descending----> ");
            Collections.sort(programming,Collections.reverseOrder());
            for(String i: programming){
               System.out.println(i);
              }
          break;
           
          case "count":
          System.out.println(" <----Count----> ");
          System.out.println(programming.size());
          break;

          case "search":
          System.out.println(" <----Key Search Data----> ");
          System.out.print(" Enter String (Title): ");
          
          String title = name.nextLine();
          int total = 0;
          for(String i: programming)
          {
            if(i.contains(title))
            {
              System.out.println(i);
              total++;
            }
          }
          System.out.print("Total Matches Found: " +total);
          break;

          case "dsearch":
          System.out.println(" <---- DSearch Data----> ");
          System.out.print(" Enter Search (Description): ");
          
          String descripton= name.nextLine();

          int descpriptotal = 0;

          for(String i: programming)
          {
            if(i.contains(descripton))
            {
              System.out.println(i);
              descpriptotal++;
            }
          }
          System.out.print("Total Matches Found: " +descpriptotal);
          break;

          default:
      }
      
        System.out.println("\nContinue? (Y/N)");
        String option = name.nextLine();
        if(option.equals("N")){
          endfunction = false;

        }else{
          endfunction = true;
        }
    }
  }
}