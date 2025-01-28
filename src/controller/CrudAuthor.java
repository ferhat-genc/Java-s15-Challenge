package controller;
import entity.Author;
import java.util.Map;
import java.util.Scanner;

public class CrudAuthor{


    public static Map<Integer, Author> CrudAuthorManager(Map<Integer, Author> authors){
        int choice;
        Scanner scanner6 = new Scanner(System.in);
        do{

            System.out.println("--- Yazar CRUD İşlemleri ---");
            System.out.println("----------------------------");
            System.out.println("1. Yazar Ekle");
            System.out.println("2. Yazar Sil");
            System.out.println("3. Yazar Güncelle");
            System.out.println("4. Yazar Görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner6.nextInt();
            scanner6.nextLine();
            switch (choice){
                case 1:

            }
        }while (choice != 0);

        scanner6.close();
        return authors;

    }



}
