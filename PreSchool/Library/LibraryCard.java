package PreSchool.Library;

public class LibraryCard {
    // data members
    // student owner of this card
    private Student owner;
    // number of books borrowed
    private int borrowCnt;

    // constructor
    public LibraryCard() {
        owner = null;
        borrowCnt = 0;
    }

    // number of book are check out
    public void checkout(int numOfBooks) {
        borrowCnt = borrowCnt + numOfBooks;
    }

    // returns the number of books borrowed
    public int getNumberofBooks() {
        return borrowCnt;
    }

    // returns the name of the owner of this card
    public String getOwnerName() {
        return owner.getName();
    }

    // sets owner of this card to student
    public void setOwner(Student student) {
        owner = student;
    }

    // returns the string representation of this card
    public String toString() {
        return "Owner name:          " + owner.getName() + "\n" + "      Email:         " + owner.getEmail() + "\n"
                + "Books Borrowed       " + borrowCnt;
    }
}
