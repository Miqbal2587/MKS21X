abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    public LibraryBook(String author, String title, String ISBN, String callNumber){
	super(author, title, ISBN);
	this.callNumber=callNumber;
    }
    public void setAuthor(String newAuthor){
	super.setAuthor(newAuthor);
    }
    public void setTitle(String newTitle){
	super.setTitle(newTitle);
    }
    public void setISBN(String newISBN){
	super.setISBN(newISBN);
    }
    public void setcallNumber(String newcallNumber){
	callNumber=newcallNumber;
    }
    public String getAuthor(){
	return super.getAuthor();
    }
    public String getTitle(){
	return super.getTitle();
    }
    public String getISBN(){
	return super.getISBN();
    }
    public String getcallNumer(){
	return callNumber;
    }
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    public int compareTo(){
	return 0;
    }
    public String toString(){
	return ("CirculationStatus:" + circulationStatus() + "; Call Number:" + callNumber); 
    }
}
