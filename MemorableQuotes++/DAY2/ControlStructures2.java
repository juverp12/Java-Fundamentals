public class ControlStructures2 {
    public static void main (String []args){
        int n;
        for(n=0; n<21; n++){
            if (n==0){
                System.out.println("First one: "+n);
            }
            else if (n < 5){
                System.out.println("Less than five: "+n);
            }
            else if ((n == 10) || (n == 11)) {
                System.out.println("Ten or Eleven: "+n);
            }
            else{
                System.out.println("Not less than five: "+n);
            }
        }
    }
}


public static void display(ArrayList<String> languages) {

    System.out.println("Welcome to the List of Programming Languages!");
    for(String language : languages) {
      System.out.print(language + ", ");
    }
  }
  public static void main(String[] args) {

    // create an arraylist
    ArrayList<String> languages = new ArrayList<>();
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");

    // passing arraylist as function parameter
    display(languages);
  }