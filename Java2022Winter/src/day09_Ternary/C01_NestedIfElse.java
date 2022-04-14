package day09_Ternary;

import java.util.Scanner;

public class C01_NestedIfElse {

    // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
    // bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
    // çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
    // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi < 1000 || sayi > 9999) {  //istenmeyen durumu yazıyoruz

            System.out.println("Lutfen 4 basamaklı sayi giriniz");

        } else if (sayi % 5 == 0) { //4 basamaklı vesayi 5'e tam bolunuyor

            if (sayi % 10 == 0) { // 4 basamakli 5 ile bolunebilen ve son rakamı 0 olan
                System.out.println("5'e bölünebilen cift sayi");
            } else { // 4 basamaklı ve 5 ile bolunebilen ve son rakamı 0 olan

                System.out.println("5'e bolunebilen tek sayı");
            }
        } else { // 4 basamaklı ve 5'e bolunemiyor
            System.out.println("Tekrar deneyin");
        }
    }
}
