class MemorableQuotes {

    private String quoteText;
    private String reference;
    private int printedCount;

    public MemorableQuotes(String quoteText, String reference){
        this.quoteText = quoteText;
        this.reference = reference;
        this.printedCount = 0 ;

    }

    public String getQuote() {
        return quoteText;
    }

    public void setQuote(String quoteText){
        this.quoteText=quoteText;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference){
        this.reference=reference;
    }

    public int getPrintedCount(){
        return printedCount;
    }
    public void incrementPrintedCount(){
        this.printedCount++;
    }

    public void printQuote(){
        if(reference==null){
            System.out.println(this.quoteText);
        }else{
            System.out.println("\n"+this.quoteText+"\n--"+this.reference + "["+printedCount+"]");
        }
    }

    public boolean matches(String text){
        if(this.quoteText.contains(text.toLowerCase())||this.reference.contains(text.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }
}
