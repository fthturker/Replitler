package day09_Ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Ternary ile yapılan tum islemler if else ile de yapılabilir
        //if else yerine ternary tercih etme sebebi yapının basit ve anlasılabilir olmasıdır
        //Ternary icerisinde kompleks kodlar olmaz
        //sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        // kullanıcıdan bir tam sayı alıp tek mi cift mı yazdıran bir kod yazalım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz:");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift");
        }else {
            System.out.println("sayi tek");
        }

        System.out.println(sayi%2==0 ? "Sayi cift" : "Sayi tek");
    }
}
