package controller;
import entity.Book;
import entity.BooksAndUsers;
import entity.User;

import java.util.Map;

public class BookManager {

    public static Map<Integer, Book> listBook (Map<Integer, Book> books){

        return books;
    }
    public static BooksAndUsers giveBook (Map<Integer, Book> books, Map<Integer, User> users, Book book, User user){

        return new BooksAndUsers(books, users);
    }
}
