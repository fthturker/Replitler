package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //kullaniciden bir kelime isteyin
        //eger kelime 3 harften kısa ise "kelime cok kısa" yazdırın
        //eger kelime 3,4 veya 5 harfli ise harf sayısını ve
        //kelimenin tersten yazılısını yazdırın
        //eger 5 harften uzunsa "kelime cok uzun" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.next();
        int harfSayisi=kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kısa");
        }else if (harfSayisi==3){
            ucHarfiTersineCevir(kelime);
        }else if (harfSayisi==4){
            dortHarfiTersineCevir(kelime);
        }else if (harfSayisi==5){
            besHarfiTersineCevir(kelime);
        }else {
            System.out.println("kelime cok uzun");
        }
    }

    public static void besHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 5");
        System.out.println("kelimenin tersten yazilisi : " +tersKelime);
    }
        //1- method olusturmak icin method'un adını yazarız
        //2- method'a giderken goturmem gereken variable varsa , bunu method'a eklemeliyim

    public static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4");
        System.out.println("kelimenin terten yazilisi : " +tersKelime);
    }
    public static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3");
        System.out.println("kelimenin terten yazilisi : " +tersKelime);
    }
}
