package entity;

import java.time.LocalDate;

public abstract class Book {
    private Long id;
    private String name;
    private Author author;
    private Publisher publisher;
    private Category category;
    private int edition;
    private LocalDate publicationDate;
    private Double price;
    private Boolean isAvailable;
    private User whichUser;


    public Book(Long id, String name, Author author, Publisher publisher, Category category,
                int edition, LocalDate publicationDate, Double price, Boolean isAvailable, User whichUser) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.category = category;
        this.edition = edition;
        this.publicationDate = publicationDate;
        this.price = price;
        this.isAvailable = isAvailable;
        this.whichUser = whichUser;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Category getCategory() {
        return category;
    }

    public int getEdition() {
        return edition;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public User getWhichUser() {
        return whichUser;
    }
}
