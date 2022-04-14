package day09_Ternary;

public class C05_Ternary {
    public static void main(String[] args) {
        //bazen ternary deki iki sonucun data turleri farklı olabilir

        //verilen sayi 100 den buyukse sayi'nin karesini alıp yazdıran
        //100'den kucukse "sayi 100'den buyuk olmalı"
        //yazdıran bir ternary olusturalım

        int sayi= 1000;
        //ternary bize sonuc getirdiginden ya sonucu direk yazdirmalıyız
        //veya bir degiskene atamaliyiz
        //eger sonuclar farklı data turlerinde ise
        // atama yapacagımız variable'ın data turu tek olacagından
        //atama yapamayız
        //SADECE direk yazdırabiliriz
        System.out.println(sayi>100 ? sayi*sayi : "sayi 100'den buyuk olmali");
    }
}
