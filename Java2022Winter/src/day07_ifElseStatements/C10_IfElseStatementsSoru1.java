package day07_ifElseStatements;

import java.util.Scanner;

public class C10_IfElseStatementsSoru1 {
    //Soru1: Kullanıcıdan dikdortgenin kenar uzunluklarını isteyin ve
    // dikdortgenin kare olup olmadıgını yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kenar uzunluklarını giriniz");

        System.out.println("kenar1=");
        int kenar1= scan.nextInt();
        System.out.println("kenar2=");
        int kenar2= scan.nextInt();

        if (kenar1 != kenar2) {
            System.out.println("Dikdortgenin alanı= " + kenar1*kenar2);
        } else {System.out.println("girdiginiz bilgiler kareye aittir");
        }
    }
}

