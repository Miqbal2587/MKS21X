public class Book{
    private String author;
    private String title;
    private String ISBN;
    public Book(){
	author="Author";
	title="title";
	ISBN = "ISBN";
    }
    public Book(String author, String title, String ISBN){
	this.author=author;
	this.title=title;
	this.ISBN=ISBN;
    }
    public void setAuthor(String newAuthor){
	author=newAuthor;
    }
    public void setTitle(String newTitle){
	title=newTitle;
    }
    public void setISBN(String newISBN){
	ISBN=newISBN;
    }
    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public String getISBN(){
	return ISBN;
    }
    public String toString(){
	return ("Author: " + author + ";Title: " + title + ";ISBN" + ISBN);
    }
}
