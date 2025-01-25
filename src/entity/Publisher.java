package entity;

import java.util.List;
import java.util.Objects;

public class Publisher {
    private Integer id;
    private String name;
    private String siteUrl;
    private List<Integer> booksId;
    private List<Integer> authorsId;

    public Publisher(Integer id, String name, String siteUrl, List<Integer> booksId, List<Integer> authorsId) {
        this.id = id;
        this.name = name;
        this.siteUrl = siteUrl;
        this.booksId = booksId;
        this.authorsId = authorsId;
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

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public List<Integer> getBooksId() {
        return booksId;
    }

    public void setBooksId(List<Integer> booksId) {
        this.booksId = booksId;
    }

    public List<Integer> getAuthorsId() {
        return authorsId;
    }

    public void setAuthorsId(List<Integer> authorsId) {
        this.authorsId = authorsId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(id, publisher.id) && Objects.equals(name, publisher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", booksId=" + booksId +
                ", authorsId=" + authorsId +
                '}';
    }
}
