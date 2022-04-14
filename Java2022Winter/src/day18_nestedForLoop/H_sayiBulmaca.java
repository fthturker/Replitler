package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        //bilgisayara 1 ile 100 arasında bir sayi tutturun
        //kullanicidan bu sayıyı tahmin etmesini isteyin
        //girilen her tahminde sayiyi buyut veya kucult diye yol gosterin
        //kullanıcı sayiyi buldugunda kac tahminde buldugunu kullaniciye yazdirin

        Random rnd=new Random();
        int sayi= rnd.nextInt(100); //burasi 100 den kucuk rastgele bir sayi olusturur


        Scanner scan = new Scanner(System.in);
        int tahmin=0;
        int sayac=0;

        while (sayi != tahmin){
            System.out.println("lutfen bir sayi giriniz : ");
            tahmin=scan.nextInt();

            if (tahmin>sayi){
                System.out.println("daha kucuk bir sayi soylemelisin");
            }else if (tahmin<sayi){
                System.out.println("daha buyuk bir sayi soylemelisin");
            }
            sayac++;
        }
        System.out.println("Tuttugum sayiyi " + sayac + " tahminde buldunuz");
    }
}
