import java.util.concurrent.TimeUnit;


public class MemorableQuotesDisplayShow {

    private MemorableQuoteDatabase memorableQuoteDatabase;

    private int delayBetweenQuotes;
    private int maxQuotesToDisplay;

    public MemorableQuotesDisplayShow(MemorableQuoteDatabase memorableQuoteDatabase){
        this.memorableQuoteDatabase=memorableQuoteDatabase;

    }

    public int getdelayBetweenQuotes(){
        return delayBetweenQuotes;
    }

    public void setdelayBetweenQuotes(int delayBetweenQuotes){
        this.delayBetweenQuotes=delayBetweenQuotes;
    }

    public int getmaxQuotesToDisplay(){
        return maxQuotesToDisplay;
    }

    public void setmaxQuotesToDisplay(int maxQuotesToDisplay){
        this.maxQuotesToDisplay=maxQuotesToDisplay;
    }

    public void execute(){
        int displayedquote = 0;
        while(maxQuotesToDisplay <= 0|| displayedquote > maxQuotesToDisplay){
            MemorableQuotes quote = memorableQuoteDatabase.getRandomQuote();
                quote.printQuote();
                displayedquote++;

            try{
                TimeUnit.SECONDS.sleep(delayBetweenQuotes);
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }

    }
  
}
