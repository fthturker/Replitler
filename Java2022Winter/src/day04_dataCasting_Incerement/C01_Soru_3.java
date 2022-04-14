package day04_dataCasting_Incerement;

import java.util.Scanner;

public class C01_Soru_3 {
    public static void main(String[] args) {

        /*
        Dikdörtgen prizmasının hacim hesaplaması V= a x b x c formülünden bulunmaktadır.
        Dikdörtgen prizmasının taban alanının hesaplanması için a ve b sayıları çarpılmaktadır.
        Buradan a x b eşitliği Ta olarak ifade edilmektedir. Yükseklik ise c olarak gösterilmektedir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Kısa kenar");
        int kısaKenar=scan.nextInt();
        System.out.println("Uzun Kenar");
        int uzunKenar=scan.nextInt();
        System.out.println("Yükseklik");
        int yukseklik=scan.nextInt();

        System.out.println("girdginiz kısa kenar : "+ kısaKenar);
        System.out.println("girdginiz uzun kenar : "+ uzunKenar);
        System.out.println("girdginiz yukseklik : "+ yukseklik);
        System.out.println("prizmanın hacmi : " + kısaKenar*uzunKenar*yukseklik);

        System.out.println("Tebrikler");
    }
}
