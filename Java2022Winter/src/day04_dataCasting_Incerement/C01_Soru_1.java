package day04_dataCasting_Incerement;

import java.util.Scanner;

public class C01_Soru_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi yaziniz");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi yaziniz");
        int sayi2= scan.nextInt();

        System.out.println("toplam : " + (sayi1+sayi2));
        System.out.println("cıkarma : " + (sayi1-sayi2));
        System.out.println("carpma : " + (sayi1*sayi2));

        System.out.println("Tesekkür ederim...");
    }
}
