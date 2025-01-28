package controller;
import entity.User;
import java.util.Map;
import java.util.Scanner;

public class CrudUser{

    public static Map<Integer, User> CrudUserManager(Map<Integer, User> users){
        int choice;
        Scanner scanner5 = new Scanner(System.in);
        do{

            System.out.println("--- Kullanıcı CRUD İşlemleri ---");
            System.out.println("--------------------------------");
            System.out.println("1. Kullanıcı Ekle");
            System.out.println("2. Kullanıcı Sil");
            System.out.println("3. Kullanıcı Güncelle");
            System.out.println("4. Kullanıcı Görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminiz: ");
            choice = scanner5.nextInt();
            scanner5.nextLine();
            switch (choice){
                case 1:

            }
        }while (choice != 0);

        scanner5.close();
        return users;

    }





}
