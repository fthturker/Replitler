package day07_ifElseStatements;

import javax.swing.*;
import java.util.Scanner;

public class C09_IfStatementsSoru2 {
    public static void main(String[] args) {
        //Soru2: Kullanıcıdan gun isimlerinden birinin ilk harfini isteyin
        //ve o harfle baslayan gun isimlerini yazdirin
        //Ornek: ilkHarf=P output="Pazar,Pazartesi veya Persembe" ilkHarf=S output="Sali"
        //***Buyuk kucuk harf problem olmaması icin toUpperCase methodunu kullanın

        Scanner scan = new Scanner(System.in);
        System.out.println("Gun isimlerinden ilk harfi giriniz");
        char harf= scan.next().toUpperCase().charAt(0);

        if (harf=='P'){
            System.out.println("Bugunler : Pazar , Pazartesi veya Persembe gunlerine aittir");
        }
        if (harf=='S'){
            System.out.println("Bugun :  Salı gunune aittir");
        }
        if (harf=='C'){
            System.out.println("Bugunler : Cuma veya Cumartesi'ye aittir");
        }
    }
}
