package entity;

import java.util.List;

public class Publisher {
    private Long id;
    private String name;
    private String siteUrl;
    private List<Book> books;
    private List<Author> authors;

    public Publisher(Long id, String name, String siteUrl, List<Book> books, List<Author> authors) {
        this.id = id;
        this.name = name;
        this.siteUrl = siteUrl;
        this.books = books;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
