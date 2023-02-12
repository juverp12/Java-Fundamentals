public class ControlStructures1 {
    public static void main (String []args){
        int n;
        for(n=0; n<21; n++){
            if (n==0){
                System.out.println("First one: "+n);
            }
            else if (n < 5){
                System.out.println("Less than five: "+n);
            }
            else{
                System.out.println("Not less than five: "+n);
            }
        }
    }
}
