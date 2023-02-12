import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class MemorableQuotes3 {


        public static void main(String[]args) throws Exception {
            if(args.length == 0)
            {
                System.out.println("Error: No Input");
            }
            else
            {
                ArrayList<String> quotes = new ArrayList<String>();        
                
                createQuotes(quotes);
                if(args[0].equals("random"))

                {   
                    
                    String getQuote = printQuote(getRandomQuotes(quotes));
                    System.out.println(getQuote);
                }

                else if(args[0].equals("all"))
                {
                    for(String i: quotes)
                    {
                        String showAll = printQuote(i);
                        System.out.println(showAll);
                    }  
                }

                else if (args[0].equals("csearch"))
                {
                    searchcontentQuotes(quotes, args[1]);
                }

                else if (args[0].equals("search"))
                {
                   searchAuthQuotes(quotes, args[1]);
                }

                else if (args[0].equals("category"))
                {
                   searchcategoryQuotes(quotes, args[1]);
                }

                else if (args[0].equals("display"))
                {   
                    String[] delay = {args[1], args[2]};
                    int delaynumber =getDelay(quotes,delay)*1000;
                    String[] max = {args[1], args[2]};
                    int maxnumber= getMax(quotes,max);
                    int count = 0;

                    while(count<maxnumber){
                        for(count=1; count<=maxnumber; count++){
                            String forqoutes =getRandomQuotes(quotes);
                            String formatquote =printQuote(forqoutes);
                            System.out.println("["+count+"/"+maxnumber+"]" + formatquote);
                            Thread.sleep(delaynumber);
                        }
    
                    }
                    
                }
            
            }
        }
        static void createQuotes(ArrayList<String>quotes) throws IOException
        {
           
                  
            File fileread = new File("quotes.txt");
            String data;
            try{
                BufferedReader myreader = new BufferedReader(new FileReader(fileread));
                while((data=myreader.readLine())!=null){
                    System.out.println(data);
                    quotes.add(data);
                }
                myreader.close();
            }catch(FileNotFoundException e){
                System.out.println("An error occured! ");
                e.printStackTrace();

            }


        }
        static String getRandomQuotes(ArrayList<String> quotes)
        {  
            Random ran = new Random();
            int output = ran.nextInt(quotes.size());
            return(quotes.get(output));
        }   

        static String printQuote(String quote)
        {
                   
            String[] print = quote.split("@");
            return(print[0] + "\n--" + print[1]); 
         
        }

        static void searchcontentQuotes(ArrayList<String> quote, String args)
        {       
            for(String i: quote){
                String[] print = i.split("@"); 
            
                if((print[0].toLowerCase()).contains(args.toLowerCase()))
                System.out.println(i);
            } 
        }

        static void searchcategoryQuotes(ArrayList<String> quote, String args)
        {       
            for(String i: quote){
                String[] print = i.split("@"); 
            
                if((print[1].toLowerCase()).contains(args.toLowerCase()))
                System.out.println(i);
            } 
        }


        static void searchAuthQuotes(ArrayList<String> quote, String args)
        {       
            for(String i: quote){
                String[] print = i.split("@"); 
            
                if((print[2].toLowerCase()).contains(args.toLowerCase()))
                System.out.println(i);
            } 
        }
        static String displayQuotes(ArrayList<String> quotes)

        {  

            Random ran = new Random();
            int output = ran.nextInt(quotes.size());
            return(quotes.get(output));
           
        }   
        public static int getDelay(ArrayList<String> quotes, String[] delay)

        {  
            int flag = 0;
            int delay1 = 0;
            for(int i=0; i<delay.length; i++){
                if (delay[i].startsWith("delay="))
                {
                    String delay2 = delay[i].substring("delay=".length());
                    flag+=1;
                    try{
                        delay1 = Integer.parseInt(delay2);

                    }
                    catch(NumberFormatException n){
                        throw new IllegalArgumentException("Invalid input given: ", n);
                    }
                }
             }
             if(flag ==0){
                throw new IllegalArgumentException("Input string must start with a 'delay= '");
                }
                return delay1;
        }   
        public static int getMax(ArrayList<String> quotes, String[] max)

        {  
            int flag = 0;
            int max1 = 0;
            for(int i=0; i<max.length; i++){
                if (max[i].startsWith("max=") ){
                    String max2 = max[i].substring("max=".length());
                    flag+=1;
                    try{
                        max1 = Integer.parseInt(max2);

                    }catch(NumberFormatException n){
                        throw new IllegalArgumentException("Invalid input given: ", n);
                    }
                }
            }if(flag ==0){
                throw new IllegalArgumentException("Input string must start with a 'max= '");
            }
                return max1;
        }
} 
         

    

