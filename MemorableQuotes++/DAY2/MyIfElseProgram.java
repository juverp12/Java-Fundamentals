public class MyIfElseProgram {
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
            else if (n >= 13 && n <= 18){
                System.out.println("YEHEY! "+n);
            }
            else{
                System.out.println("Not less than five: "+n);
            }
        }
    }
}
