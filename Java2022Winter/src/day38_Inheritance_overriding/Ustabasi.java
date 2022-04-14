package day38_Inheritance_overriding;

public class Ustabasi extends Isci{

    public String statu="Ustabasi";
    public String haklar="ustabasi haftada birgun ekstra tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("ariza varsa Ustabasi ekstra ucret almadan calisir");
    }
    public void maasHesapla(){
        System.out.println("Tum ustabasi 30 gun * 8 saat * 12 euro = " + (30*8*12) + " Euro maas alir");
    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz class'dan klasik haliyle bir obje olusrurursak
        o obje ile cagirdsigimiz variable ve method'larda
        Java once icinde bulundugumuz class'a bakar
        aradigimiz class uyesi, icinde oldugumuz class2da varsa
        bize onu getirir
        YOKSA,
        parent class(lar)a bakar, ilk buldugunu getirir
         */
        Ustabasi yasin= new Ustabasi();
        System.out.println(yasin.statu); // Ustabasi
        System.out.println(yasin.haklar); // ustabasi haftada birgun ekstra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye); // isciler yilda 1 kere ikramiye alir
        System.out.println(yasin.izin); //tum personel  yilda 4 kere izin yapabilir
        yasin.maasHesapla();
        yasin.mesai();

        /*
        eger isci olarak ozelliklerini gormek istersek
        Class adini /data turu ) isci seceriz
         */
        Isci ahmet = new Ustabasi();
        System.out.println(ahmet.statu); // isci
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar
        System.out.println(ahmet.ikramiye); // isciler yilda 1 kere ikramiye alir
        System.out.println(ahmet.izin); // tum personel 1 yilda 4 kere izin yapabilir
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
        Siz bir obje yi hangi class'dan tanimlarsaniz o class'a ait ozelliklere sahip olur
         */

        Personel adem= new Ustabasi();
        System.out.println(adem.statu); // Personel
        System.out.println(adem.haklar); // Tum personel esit haklara sahiptir
        //System.out.println(adem.ikramiye); // CTE verir
        System.out.println(adem.izin); // tum personel 1 yilda 4 kere izin yapabilir
        adem.maasHesapla();
        adem.mesai();

        /*
        Personel adem= new Ustabasi(); Bu bir ustabasi objesidir
        Personel adem= new Personel(); Bu ise personel objesidir
         */

        /*
        Personel adem= new Ustabasi();

        adem'in data turu Personel'dir
        boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'i Ustabasi oldugunu biliyorum
        cunku constructor'u Ustabasi
        Ama bu olusturma formati ile
        adem'in tum personel ile birlikte sahip oldugu
        ortak ozellikleri vurgulamak istiyorum

        Bu kullanim seklinde olusturulan obje data turu olarak secilen class
        ve onun parent class'larindaki variable'ları kullanabilir

         */

    }
}
