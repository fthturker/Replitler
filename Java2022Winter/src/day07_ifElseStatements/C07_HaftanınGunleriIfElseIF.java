package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftanınGunleriIfElseIF {
    public static void main(String[] args) {

        // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        //eger kullanıcı gun ismini yanlis girerse "Yanlis giris" yazdirin
        // Ornek: gun=Pazar output = “Hafta sonu”
        //gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ===> hafta sonu
        //pazartesi veya salı veya carsamba veya persembe veya cuma ise ===>hafta ici


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazin:");
        String gunIsmi= scan.next().toLowerCase();

        //hatalı girisleride yazdırmak icin olasılıkları uce cıkardım
        //haftasonu - haftaici - yanlıs giris
        if(gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")){

            System.out.println("girdiginiz gun hafta sonu");

        }else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("salı") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")){

            System.out.println("girdiginiz gun hafta ici");

        }else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");

        }

        //eger if else if ..... statement else ile bitiyorsa
        //olasılıklardan sadece bir tanesi mutlaka calısır
        //Java ilk buldugu true'a ait sonucu yazdirir
        //ve kalan sartlara bakmaz

        //if else if.... cumleleri else ile  bitmese de calisir
        //ancak bu durumda sadece bir olasılık calısabilir VEYA hic bir islem yapilmayabilir
    }
}
