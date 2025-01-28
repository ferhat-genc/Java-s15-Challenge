package controller;
import entity.Book;

import java.time.Year;
import java.util.*;

public class CrudBook implements ICrudMethods{


    public Map<Integer, Book> CrudBookManager(Map<Integer, Book> books){
        int choice;
        Scanner scanner2 = new Scanner(System.in);
        do{
            System.out.println("--- Kitap CRUD İşlemleri ---");
            System.out.println("----------------------------");
            System.out.println("1. Kitap Ekle");
            System.out.println("2. Kitap Sil");
            System.out.println("3. Kitap Güncelle");
            System.out.println("4. Kitap Görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner2.nextInt();
            scanner2.nextLine();
            switch (choice){
                case 1:
                    int lastId;
                    TreeSet<Integer> ids = new TreeSet<>(books.keySet());
                    lastId = ids.last() +1;
                    System.out.println("Id için girilecek numara: " + lastId);
                    books.put(lastId, create());
                    System.out.println("------------ Yeni Kitap Eklendi------------");
                    choice = -1;
                case 2:



            }
        }while (choice != 0);

        scanner2.close();
        return books;
    }


    @Override
    public Book create() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kitap ID: ");
        int bookId = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Kitabın adı: ");
        String bookName = scanner.nextLine();

        System.out.print("Yazar ID: ");
        int authorId = scanner.nextInt();

        System.out.print("Yayınevi ID: ");
        int publisherId = scanner.nextInt();

        System.out.print("Kategori ID: ");
        int categoryId = scanner.nextInt();

        System.out.print("Kaçıncı Baskı: ");
        int edition = scanner.nextInt();

        System.out.print("Basım Yılı: ");
        int pubYear = scanner.nextInt();

        System.out.print("Fiyatı: ");
        double price = scanner.nextDouble();

        boolean isAvailable = false;



        Book book = new Book(bookId, bookName, authorId, publisherId, categoryId, edition, Year.of(pubYear), price, isAvailable, null);
        scanner.close();
        return book;
    }


    @Override
    public Map delete() {
        return Map.of();
    }

    @Override
    public Map update() {
        return Map.of();
    }

    @Override
    public Map read() {
        return Map.of();
    }
}
