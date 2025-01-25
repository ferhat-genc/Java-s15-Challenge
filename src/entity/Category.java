package entity;

import java.util.List;
import java.util.Objects;

public class Category {
    private Integer id;
    private String name;
    private List<Integer> booksId;

    public Category(Integer id, String name, List<Integer> booksId) {
        this.id = id;
        this.name = name;
        this.booksId = booksId;
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

    public List<Integer> getBooksId() {
        return booksId;
    }

    public void setBooksId(List<Integer> booksId) {
        this.booksId = booksId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", booksId=" + booksId +
                '}';
    }
}
