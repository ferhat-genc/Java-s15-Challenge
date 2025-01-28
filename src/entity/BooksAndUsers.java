package entity;

import java.util.Map;

public class BooksAndUsers {
    Map<Integer, Book> books;
    Map<Integer, User> users;

    public BooksAndUsers(Map<Integer, Book> books, Map<Integer, User> users) {
        this.books = books;
        this.users = users;
    }

}
