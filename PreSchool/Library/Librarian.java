package PreSchool.Library;

public class Librarian {
    public static void main(String[] args) {
        Student student;
        LibraryCard card1;

        student = new Student();
        student.setName("John Conner");
        student.setEmail("john.c@cmu.ac.th");



        card1 = new LibraryCard();
        card1.setOwner(student);
        card1.checkout(3);



        System.out.println("Card1 info:");
        System.out.println(card1.toString() + "\n");


    }

}
