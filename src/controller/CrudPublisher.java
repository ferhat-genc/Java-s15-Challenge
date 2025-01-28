package controller;
import entity.Publisher;
import java.util.Map;
import java.util.Scanner;

public class CrudPublisher{

    public static Map<Integer, Publisher> CrudPublisherManager(Map<Integer, Publisher> publishers){
        int choice;
        Scanner scanner4 = new Scanner(System.in);
        do{

            System.out.println("--- Yayınevi CRUD İşlemleri ---");
            System.out.println("-------------------------------");
            System.out.println("1. Yayınevi Ekle");
            System.out.println("2. Yayınevi Sil");
            System.out.println("3. Yayınevi Güncelle");
            System.out.println("4. Yayınevi Görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner4.nextInt();
            scanner4.nextLine();
            switch (choice){
                case 1:

            }
        }while (choice != 0);

        scanner4.close();
        return publishers;

    }

}
