package day34_accessModifier_encapsulation;

public class C04_Enscapsulation {
    public static void main(String[] args) {
        /*
         bir variable 'i encapsule etmek icin
         1- Access modifier'i private yapariz
         2- okuma ve yazma ozelliklerini kullanilmasini istedigimiz
         gibi sinirlayabiliriz
            -eger sadece okunmasini istiyorsaniz getter
            -sadece deger girilebilsin isterseniz setter
             olusturabiliriz
         Bir variable icin hen getter hem de setter olusturursaniz
         o variable public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz

         piyasada developer'lar arasinda genel uygulama da boyledir


         */

        C03 obj = new C03();

        System.out.println(obj.getSayi()); // 0

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr()); // Java Java Java

        System.out.println(obj); // sayi=0, str=Java Java Java

    }
}
