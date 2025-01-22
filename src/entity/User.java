package entity;

import java.util.List;

public class User extends People{

    private int credit;
    private List<Book> receivedBooks;

    public User(Long id, String name, int credit, List<Book> receivedBooks) {
        super(id, name);
        this.credit = credit;
        this.receivedBooks = receivedBooks;
    }

    public int getCredit() {
        return credit;
    }

    public List<Book> getReceivedBooks() {
        return receivedBooks;
    }
}
