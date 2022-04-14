package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //Soru 1) Kullanıcıdan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz:");
        int sayi= scan.nextInt();

        if (sayi%2 == 0){
            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi%2 != 0){
            System.out.println("girilen sayi tek sayidir");
        }

        // normalde bir tam sayi ya tektir veya cifttir, ucuncu bir durum yoktur
        //o zaman tek olmasi ve cift olmasini iki ayri if ile degil
        //if else ile tek satement'da yapmak daha güzel olur
        // ========= if else ile cozum ========

        if (sayi%2==0){
            System.out.println("girdiginiz sayi cifttir");
        } else {
            System.out.println("girdiginiz sayi tektir");
        }
    }
}
