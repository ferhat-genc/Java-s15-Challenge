package entity;

import java.util.List;
import java.util.Objects;

public class Author extends People{

    private List<Integer> booksId;
    private List<Integer> publishersId;

    public Author(Integer id, String name, List<Integer> booksId, List<Integer> publishersId) {
        super(id, name);
        this.booksId = booksId;
        this.publishersId = publishersId;
    }

    public List<Integer> getBooksId() {
        return booksId;
    }

    public void setBooksId(List<Integer> booksId) {
        this.booksId = booksId;
    }

    public List<Integer> getPublishersId() {
        return publishersId;
    }

    public void setPublishersId(List<Integer> publishersId) {
        this.publishersId = publishersId;
    }

    @Override
    public String toString() {
        return "Author{" +
                "booksId=" + booksId +
                ", publishersId=" + publishersId +
                '}';
    }
}

