import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class MemorableQuotes2 {
    static Scanner input= new Scanner(System.in);


        public static void main(String[]args) throws InterruptedException {
            if(args.length == 0)
            {
                System.out.println("Error: No Input");
            }else{
                ArrayList<String> quotes = new ArrayList<String>();        
                
                createQuotes(quotes);
                if(args[0].equals("random"))

                {   
                    String getQuote = printQuote(quotes,getRandomQuotes(quotes));
                    System.out.println(getQuote);
                }
                else if(args[0].equals("all"))
                {
                    for(String i: quotes)
                    {
                        String showAll = printQuote(quotes,i);
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
                            String formatquote =printQuote(quotes,forqoutes);
                            System.out.println("["+count+"/"+maxnumber+"]" + formatquote);
                            Thread.sleep(delaynumber);
                        }
    
                    }
                }
                else if (args[0].equals("add"))
                {   
                    System.out.println("Enter your new qoutes(Quotes@Category@Author)");
                    String writequotes = input.nextLine();
                    quotes.add(writequotes);
                    addQuotes(quotes);
                }
                else if (args[0].equals("delete")) {
                
                    System.out.print("Enter the line number to delete: ");
                    int lineNumber1 = input.nextInt();
                    quotes.remove(lineNumber1 - 1);
                    updateQuote(quotes);
                }
                else if (args[0].equals("update")) {
                
                    System.out.print("Enter the line number to update: ");
                    int lineNumber2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Input new quotes: ");
                    String inputQuotes = input.nextLine();
                    quotes.set(lineNumber2 - 1, inputQuotes);
                    updateQuote(quotes);
    
                }
            }
        }
        static void createQuotes(ArrayList<String>quotes)
        {
            
            // quotes.add("Whatever you are, be a good one @hope@ by Juver");
            // quotes.add("Be yourself, everyone else is already taken @love@ by James");
            // quotes.add("If you are going through hell, keep going @hope@ by John");
            // quotes.add("Every man dies, Not every man lives @love@ by Paul");
            // quotes.add("Don't stop dreaming, you're getting there @hope@ by Christian");

            File myObj = new File("quotes.txt");
            try {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                  String data = myReader.nextLine();
                  quotes.add(data);
                }
                myReader.close();
              } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }

        }
        static String getRandomQuotes(ArrayList<String> quotes)
        {  
            Random ran = new Random();
            int output = ran.nextInt(quotes.size());
            return(quotes.get(output));
        }   

        static String printQuote(ArrayList<String> quotes, String quote)
        {
                   
            String[] print = quote.split("@");
            int count = Integer.parseInt(print[3]);
            count+=1;
            int index=quotes.indexOf(quote);
            quotes.set(index, print[0]+"@"+print[1]+"@"+print[2]+"@"+count);
            updateQuote(quotes);
            return(print[0] + "\n--" + print[1] +" counter:"+count); 
         
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
        static void addQuotes(ArrayList<String> quotes){
            try {
                FileWriter writer = new FileWriter("quotes.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                for (String str : quotes) {
                    bufferedWriter.write(str);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
                System.out.println("Data written to file successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred while writing data to the file: " + e.getMessage());
            }  
        }  
        static void updateQuote(ArrayList<String> quotes) {
            try{
            FileWriter file = new FileWriter("quotes.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            for (String str :quotes){
              buffer.write(str);
              buffer.newLine();
            }
            buffer.close();
            } catch (IOException e){
              System.out.println("Error to update Quotes"+ e.getMessage());
            }
      }
} 
         

    

