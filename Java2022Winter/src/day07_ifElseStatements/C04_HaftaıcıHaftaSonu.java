package day07_ifElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_HaftaıcıHaftaSonu {
    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu
        // oldugunu yazdirin Ornek: gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi veya salı veya carsamba veya persembe veya cuma ise ===>hafta ici

        //String case sensitive'dir
        //yani pazar, PAZAR, Pazar bunlar hep farklı kelimelerdir

        //bu durumda String metodlarından yardım alırız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazin:");
        String gunIsmi= scan.next().toLowerCase(); //kullanici nasıl yazarsa yazsın

        //String ifadelerde == kullanılması tavsiye edilmez
        //cunku bekledigimizden farklı sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){
            System.out.println("girdiginiz gun haftasonu");
        }

        if (gunIsmi.equals("pazartesi") ||gunIsmi.equals("salı") || gunIsmi.equals("carsamba") ||gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){
            System.out.println("girdiginiz gun haftaici");
        }
    }
}
