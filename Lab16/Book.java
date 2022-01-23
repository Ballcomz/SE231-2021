
public class Book extends Publication{
    private String author;

    public Book() {
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String author, String publisher, int page_no, double price, String title) {
        super(publisher, page_no, price, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String pubPrint() {
        return super.pubPrint() + "\nThis book has written by " + author + "."; 


    }
}
