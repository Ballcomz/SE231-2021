

public class KidMagazine extends Publication{
    private int rec_age;

    public KidMagazine() {
    }

    public KidMagazine(int rec_age) {
        this.rec_age = rec_age;
    }

    public KidMagazine(int rec_age, String publisher, int page_no, double price, String title) {
        super(publisher, page_no, price, title);
        this.rec_age = rec_age;
    }

    public int getRec_age() {
        return rec_age;
    }

    public void setRec_age(int rec_age) {
        this.rec_age = rec_age;
    }

    @Override
    public String pubPrint() {
        return super.pubPrint() + "\nThis kidmagazine is recommneded for age over " + rec_age + ".";
    }


}
