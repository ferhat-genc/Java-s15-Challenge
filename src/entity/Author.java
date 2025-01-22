package entity;

import java.util.List;

public class Author extends People{
    private List<Book> books;
    private List<Publisher> publishers;

    public Author(Long id, String name, List<Book> books, List<Publisher> publishers) {
        super(id, name);
        this.books = books;
        this.publishers = publishers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }
}
