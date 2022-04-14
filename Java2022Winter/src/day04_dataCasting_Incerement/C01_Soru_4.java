package day04_dataCasting_Incerement;

import java.util.Scanner;

public class C01_Soru_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isminizi yaziniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Isim : " + isim);
        System.out.println("soyisim : " + soyisim);

        System.out.println("Kursumuza Katılımınız alınmıstır,tesekkür ederiz");
    }
}
