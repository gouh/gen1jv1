package gen1.jv1.class411.class002;

// Subclase final de User - representa un lector
public final class Reader extends User {
    private int borrowedBooks;

    public Reader(String name, String id) {
        super(name, id);
        this.borrowedBooks = 0;
    }

    public Reader(String name, String id, int borrowedBooks) {
        super(name, id);
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String getRole() {
        return "Reader";
    }

    public void borrowBook() {
        borrowedBooks++;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }
}
