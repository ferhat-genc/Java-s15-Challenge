package controller;
import entity.Category;
import java.util.Map;
import java.util.Scanner;

public class CrudCategory{

    public static Map<Integer, Category> CrudCategoryManager(Map<Integer, Category> categories){
        int choice;
        Scanner scanner3 = new Scanner(System.in);
        do{

            System.out.println("--- Kategori CRUD İşlemleri ---");
            System.out.println("-------------------------------");
            System.out.println("1. Kategori Ekle");
            System.out.println("2. Kategori Sil");
            System.out.println("3. Kategori Güncelle");
            System.out.println("4. Kategori Görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner3.nextInt();
            scanner3.nextLine();
            switch (choice){
                case 1:

            }
        }while (choice != 0);

        scanner3.close();
        return categories;

    }




}
