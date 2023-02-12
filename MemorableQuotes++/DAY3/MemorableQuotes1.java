import java.util.ArrayList;
import java.util.Random;
public class MemorableQuotes1{

        static ArrayList<String> quotes = new ArrayList<String>();
        static void creatQuotes(){
            quotes.add("Whatever you are, be a good one : by Juver");
            quotes.add("Be yourself, everyone else is already taken : by James");
            quotes.add("If you are going through hell, keep going : by John");
            quotes.add("Every man dies, Not every man lives : by Paul");
            quotes.add("Don't stop dreaming, you're getting there : by Christian");
            }
                public static String getRandomQuotes(){
                Random quote= new Random();
                int index = quote.nextInt(quotes.size());
                return quotes.get(index);
            }
        public static void main(String[] args) {
            creatQuotes();
            String getQuote =getRandomQuotes();
            System.out.println(getQuote);
          }
}

    

