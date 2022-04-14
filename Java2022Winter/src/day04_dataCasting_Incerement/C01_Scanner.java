package day04_dataCasting_Incerement;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini alıp isminin bas harfini yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi girin");

        char ilkHarf = scan.next().charAt(0);
        //charAt(index) method'u parametre olarak yazdığımız index'deki char'i bize getirir
        //String'deki index 0'dan baslar

        System.out.println("girdiginiz ismin ilk harfi : "+ilkHarf);

    }
}
