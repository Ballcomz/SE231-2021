
public class Publication {
    private String publisher;
    private int page_no;
    private double price;
    private String title;

    public Publication() {

    }

    public Publication(String publisher, int page_no, double price, String title) {
        this.publisher = publisher;
        this.page_no = page_no;
        this.price = price;
        this.title = title;

    }

    public String getPublisher() {
        return publisher;
    }

    public int getPage_no() {
        return page_no;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setPage_no(int page_no) {
        this.page_no = page_no;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String pubPrint() {
        return "The " + publisher + " publishs " + title + ", " + page_no + " pages, " + price + " Bahts.";
    }

}
