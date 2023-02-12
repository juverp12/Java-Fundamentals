public class StaticArray1 {
    public static void main(String [] args){
        String [] strings ={
            "First String",
            "Second String",
            "Third String",
            "Fourth String" 
        };
            for(int n=strings.length-1; n>=0; n--)
                System.out.println(strings[n]);
    }
}
