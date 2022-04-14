package day04_dataCasting_Incerement;

import java.util.Scanner;

public class C01_Soru_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kenar uzunluğu");
        int sayi=scan.nextInt();

        System.out.println("karenin çevresi : " + (sayi*4));
        System.out.println("karenin alanı : " + (sayi*sayi));

        System.out.println("BİTTİ");
    }

}
