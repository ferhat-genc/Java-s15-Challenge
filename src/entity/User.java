package entity;

import java.util.List;

public class User extends People{

    private int credit;
    private List<Integer> receivedBooksId;

    public User(Integer id, String name, int credit, List<Integer> receivedBooksId) {
        super(id, name);
        this.credit = credit;
        this.receivedBooksId = receivedBooksId;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public List<Integer> getReceivedBooksId() {
        return receivedBooksId;
    }

    public void setReceivedBooksId(List<Integer> receivedBooksId) {
        this.receivedBooksId = receivedBooksId;
    }

    @Override
    public String toString() {
        return "User{" +
                "credit=" + credit +
                ", receivedBooksId=" + receivedBooksId +
                '}';
    }
}
