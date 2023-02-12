class MemorableQuotes {

    private String quoteText;
    private String reference;

    public MemorableQuotes(String quoteText, String reference){
        this.quoteText = quoteText;
        this.reference = reference;

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

    public void printQuote(){
        if(reference==null){
            System.out.println(this.quoteText);
        }else{
            System.out.println("\n"+this.quoteText+"\n--"+this.reference+"\n");
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
