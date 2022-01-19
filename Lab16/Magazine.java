
public class Magazine extends Publication{
    private String pub_unit;

    public Magazine() {
    }

    public Magazine(String publisher, int page_no, double price, String title, String pub_unit) {
        super(publisher, page_no, price, title);
        this.pub_unit = pub_unit;
    }

    public String getPub_unit() {
        return pub_unit;
    }

    public void setPub_unit(String pub_unit) {
        this.pub_unit = pub_unit;
    }

    @Override
    public String pubPrint() {
        return super.pubPrint() + "\nThis megazine is " + pub_unit + " print."; 
    }


}
