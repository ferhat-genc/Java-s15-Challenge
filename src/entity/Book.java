package entity;

import java.time.LocalDate;
import java.time.Year;
import java.util.Objects;


public class Book {
    private Integer id;
    private String name;
    private Integer authorId;
    private Integer publisherId;
    private Integer categoryId;
    private int edition;
    private Year publicationDate;
    private Double price;
    private Boolean isAvailable;
    private Integer whichUserId;

    public Book() {
    }

    public Book(Integer id, String name, Integer authorId, Integer publisherId, Integer categoryId, int edition, Year publicationDate, Double price, Boolean isAvailable, Integer whichUserId) {
        this.id = id;
        this.name = name;
        this.authorId = authorId;
        this.publisherId = publisherId;
        this.categoryId = categoryId;
        this.edition = edition;
        this.publicationDate = publicationDate;
        this.price = price;
        this.isAvailable = isAvailable;
        this.whichUserId = whichUserId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Year getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Year publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Integer getWhichUserId() {
        return whichUserId;
    }

    public void setWhichUserId(Integer whichUserId) {
        this.whichUserId = whichUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authorId=" + authorId +
                ", publisherId=" + publisherId +
                ", categoryId=" + categoryId +
                ", edition=" + edition +
                ", publicationDate=" + publicationDate +
                ", price=" + price +
                ", isAvailable=" + isAvailable +
                ", whichUserId=" + whichUserId +
                '}';
    }
}
