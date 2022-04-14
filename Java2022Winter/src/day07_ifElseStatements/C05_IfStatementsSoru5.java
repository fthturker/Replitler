package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfStatementsSoru5 {
    public static void main(String[] args) {
        //Soru5: Kullanıcıdan bir gun alın eger gun
        //"Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin
        //"Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin
        //"Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdırın

        Scanner scan =new Scanner(System.in);
        System.out.println("Haftaici yada haftasonu bir gun giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        }
        else if (gun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        else if (gun.equals("Pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe")) {
            System.out.println("Mubarek olmayan bir gun girdiniz");
        }
        else {
            System.out.println("maalesef dogru bir gun yazmadınız");}

    }
}
