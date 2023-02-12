public class StringConcatenation2 {
    public static void main (String []args){
        
        StringBuilder builder = new StringBuilder("");


        for(int x=0; x<100001; x++){
            builder.append("Juver");
                
        }
        System.out.print(builder);
    }
}

