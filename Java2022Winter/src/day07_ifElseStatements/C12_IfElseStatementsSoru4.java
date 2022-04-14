package day07_ifElseStatements;

import java.util.Scanner;

public class C12_IfElseStatementsSoru4 {
    public static void main(String[] args) {
        //Soru4: Kullaniciden bir ucgenin uc kenar uzunlugunu alın
        //eger uc kenar uzunlugu biribirine esit ise
        //ekrana "Eskenar ucgen" yazdırın
        //diger durumlarda ekrana "Eskenar degil" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kenar uzunluklarını giriniz");

        System.out.println("kenar1=");
        int kenar1= scan.nextInt();
        System.out.println("kenar2=");
        int kenar2= scan.nextInt();
        System.out.println("kenar3=");
        int kenar3= scan.nextInt();

        if (kenar1 != kenar2) {
        }
        if (kenar1 != kenar3) {
        }
        if (kenar2 != kenar3) {
            System.out.println("Eskenar ucgen degildir");
        } else {
            System.out.println("Eskenar ucgen");
        }
    }
}
