import java.util.ArrayList;
import java.util.Random;

public class MemorableQuoteDatabase {

    private ArrayList<MemorableQuotes> quotes;
    private Random rand;



    public MemorableQuotes getRandomQuote(){
        if(quotes.size()==0){
            throw new IllegalArgumentException("No data in the database");
        }
        int randomIndex= rand.nextInt(quotes. size());
            return quotes.get(randomIndex);
        } 

    public MemorableQuoteDatabase(){
        quotes = new ArrayList<MemorableQuotes>();
        rand = new Random(); 
    }

    public void addQuote(MemorableQuotes quote){
        quotes.add(quote);
    }
    
    public void removeQuote(MemorableQuotes quote){
        quotes.remove(quote);
    }

    public int getQuoteCount(){
        return quotes.size();
    }

    public MemorableQuotes getQuoteByIndex(int n){
        return quotes.get(n);
    }

    public ArrayList<MemorableQuotes>getAllQuotes(){
        return quotes;
    }
    public ArrayList<MemorableQuotes> searchQuotes(String text){
        ArrayList<MemorableQuotes> matchquote = new ArrayList<>();
            for(MemorableQuotes quote: quotes){
                if(quote.matches(text)){
                    matchquote.add(quote);
                }
            }
        return matchquote;
    }

}
