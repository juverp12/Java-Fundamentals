public class JavaStaticArray {
    public static void main (String [] args){
        String [] strings;
        strings = new String[]{
            "First String",
            "Second String",
            "Third String",
            "Fourth String"
        };
            strings [0] ="First String ";
            for(int n=0; n<strings.length; n++){
                System.out.println(strings[n]);
            }
    }
}
