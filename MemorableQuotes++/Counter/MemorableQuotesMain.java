import java.util.ArrayList;
public class MemorableQuotesMain {

    public static void main(String[] args) {
        
        MemorableQuoteDatabase quotesdata = new MemorableQuoteDatabase();             


        quotesdata.addQuote(new MemorableQuotes("If life were predictable it would cease to be life, and be without flavor", "Juver"));
        quotesdata.addQuote(new MemorableQuotes("The way to get started is to quit talking and begin doing", "James"));
        quotesdata.addQuote(new MemorableQuotes("Life is what happens when you're busy making other plans" , "Paul"));
        quotesdata.addQuote(new MemorableQuotes("The more you give the more blessings you will receive" , "Disney"));

        if(args.length == 0) 
        {
            System.out.println("Error: No Input");
        }else{      
            
            if(args[0].equals("all"))
            {
                ArrayList<MemorableQuotes> quotes= quotesdata.getAllQuotes();
                    for(MemorableQuotes quote: quotes){
                        quote.printQuote();
                }
            }
            else if(args[0].equals("random"))
            {   
                MemorableQuotes quote =quotesdata.getRandomQuote();
                quote.printQuote();
            }
            else if (args[0].equals("search"))
            {
                ArrayList<MemorableQuotes> matchquote = quotesdata.searchQuotes(args[1]);
                    for(MemorableQuotes quote: matchquote){
                        quote.printQuote();
                }
            } 
            else if (args[0].equals("display"))
            {
                int max = 0;
                int delay = 3;
                for(int i=0; i<args.length; i++)
                    if (args[i].startsWith("delay=")){
                    delay = Integer.parseInt(args[i].substring(6));
                }
                else if (args[i].startsWith("max=")){
                    max = Integer.parseInt(args[i].substring(4));
                } 

                MemorableQuotesDisplayShow display = new MemorableQuotesDisplayShow(quotesdata);
                display.setdelayBetweenQuotes(delay);
                display.setmaxQuotesToDisplay(max);
                display.execute();
            }
        }
    }
}
        