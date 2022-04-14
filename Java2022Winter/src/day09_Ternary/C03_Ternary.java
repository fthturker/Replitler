package day09_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {


        int sayi=-140;
        //verilenn sayının 3 veya daha cok basamaklı sayı olup olmadıgını kontrol eden
        // ve sonucu yazdıran bir ternary yazdırın

        String sonuc=sayi>=100 ? "Sayi 3 basamaklı veya daha buyuk" : "sayi negatif veya 3 basamaktan kucuk ";

        //ternary bize sonuc dondurdugu icin
        //ya bu sonucu direk yazdırmalıyız yada sonucun
        //data türüne uygun bir variable 'a atama yapabiliriz

        System.out.println("girdiginiz sayi analizi : " + sonuc);
    }
}
