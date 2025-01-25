import entity.*;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        {
        List<Integer> demoList = new ArrayList<>();
        for(Integer i = 1; i<=5; i++){
            demoList.add(i);
        }
//        System.out.println(demoList);

        Map<Integer, Category> categories = new HashMap<>();
        categories.put(1,new Category(1,"Kültür", demoList));
        categories.put(2,new Category(2,"Tarih", demoList));
        categories.put(3,new Category(3,"Sanat", demoList));
        categories.put(4,new Category(4,"Şiir", demoList));
        categories.put(5,new Category(5,"İnceleme", demoList));
//        System.out.println(categories);

        Map<Integer, Publisher> publishers = new HashMap<>();
        publishers.put(1, new Publisher(1, "İstanbul Yayınları", "ist.com", demoList, demoList));
        publishers.put(2, new Publisher(2, "Ankara Yayınları", "ank.com", demoList, demoList));
        publishers.put(3, new Publisher(3, "Töre-Devlet Yayınları", "tor.com", demoList, demoList));
        publishers.put(4, new Publisher(4, "İz Yayınları", "iz.com", demoList, demoList));
        publishers.put(5, new Publisher(5, "Fatih Yayınları", "fat.com", demoList, demoList));

        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User(1, "Ali", 5, demoList));
        users.put(2, new User(2, "Veli", 5, demoList));
        users.put(3, new User(3, "Ferhat", 5, demoList));
        users.put(4, new User(4, "Ahmet", 5, demoList));
        users.put(5, new User(5, "Can", 5, demoList));

        Map<Integer, Author> authors = new HashMap<>();
        authors.put(1, new Author(1, "Rahmi", demoList, demoList));
        authors.put(2, new Author(2, "İsmail", demoList, demoList));
        authors.put(3, new Author(3, "İbrahim", demoList, demoList));
        authors.put(4, new Author(4, "Mehmet", demoList, demoList));
        authors.put(5, new Author(5, "Samet", demoList, demoList));

        Map<Integer, Book> books = new HashMap<>();
        books.put(1, new Book(1, "Nutuk", 1, 1, 1, 1, Year.of(1995), 85.00, true, null));
        books.put(2, new Book(2, "Bülbülü Öldürmek", 2, 1, 2, 5, Year.of(1998), 100.00, false, 1));
        books.put(3, new Book(3, "Yüzyıllık Yalnızlık", 3, 2, 2, 8, Year.of(2005), 185.00, false, 2));
        books.put(4, new Book(4, "Puslu Kıtalar Atlası", 4, 3, 4, 9, Year.of(2015), 50.00, false, 1));
        books.put(5, new Book(5, "Fahrenheit 451", 5, 5, 1, 7, Year.of(1987), 75.00, true, null));

        System.out.println(books);
        }//Sahte Veriler




    }

}