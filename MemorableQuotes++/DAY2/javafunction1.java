public class javafunction1 {
    static int myFunctions (int x){
        return(x/2);
    }

    public static void main(String[]args){
        for(int x=0; x<10; x++){
            System.out.println("f("+ x +") = " +myFunctions(x));
        }
    }
}
