package Lab16;

public class TestPublication {
    public static void main(String[] args) {
        // Polymorphism in pub1
        Publication pub1 = new Magazine("Marvel Comic", 30, 3.00, "Spiderman", "monthly");
        System.out.println(pub1.pubPrint());
        System.out.println();

        Magazine pub2 = new Magazine();
        System.out.println(pub2.pubPrint());
        System.out.println();

        Magazine pub3 = new Magazine("DC Comic", 30, 3.00, "Aquaman", "weekly");
        System.out.println(pub3.pubPrint());
        System.out.println("++++++++++++++++++++");


        // Polymorphism in pub4
        Publication pub4 = new Book();
        System.out.println(pub4.pubPrint());
        System.out.println();

        Book pub5 = new Book("J.R.R Tolkein");
        System.out.println(pub5.pubPrint());
        System.out.println();

        Book pub6 = new Book("J.R.R Tolkein", "London Book", 300, 150.50, "Hobbit");
        System.out.println(pub6.pubPrint());
        System.out.println();

        Book pub7 = new Book("G. Martin", "Newyork Pub", 400, 100.30, "Song of Soda and Wine");
        System.out.println(pub7.pubPrint());
        System.out.println("++++++++++++++++++++++");

        // Polymorphism in pub8
        Publication pub8 = new KidMagazine();
        System.out.println(pub8.pubPrint());
        System.out.println();

        KidMagazine pub9 = new KidMagazine(13);
        System.out.println(pub9.pubPrint());
        System.out.println();

        KidMagazine pub10 = new KidMagazine(15, "The Parents", 100, 120, "Kids Gangster");
        System.out.println(pub10.pubPrint());
        System.out.println("++++++++++++++++++++");

    }


}
