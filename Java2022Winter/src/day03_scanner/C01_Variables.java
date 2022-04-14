package day03_scanner;

public class C01_Variables {

    public static void main(String[] args) {
        //1- Farklı 3 data turunde variable oluşturun ve bunları yazdırın

        String okulIsmi="Yildiz Koleji";
        System.out.println(okulIsmi);

        char ilkHarf;
        ilkHarf='K';
        System.out.println(ilkHarf);

        int sayi1=10,   sayi2=20;
        System.out.println(sayi1+sayi2);

        //2- isim ve soyisim icin iki variable oluşturun ve bunları
        // isminiz: Mehmet
        //soyisminiz: Bulutluoz
        //seklinde yazdırın

        String isim="Fatih";
        String soyIsim="Türker";

        System.out.println("Isminiz : " + isim);
        System.out.println("soyisminiz : " + soyIsim);

        //3- iki farklı tamsayi data turunde 2 variable olusturun bunların toplamını
        //yazdirin

        short sayi13=20;
        double sayi14=30;
        System.out.println("iki sayinin toplamı : "+(sayi13 + sayi14));

        //4- bir tamsayı ve bir ondalıklı variable olusturun ve bunların toplamını yazdırın



        //5-char data turnde br variable olusturun ve yazdırın

        char ozelKarakter='#';
        System.out.println(ozelKarakter);

        //6-bir tamsayi, bir de char dedisken olusturun ve bunların toplamını yazdırın

        int sayi5=20;
        char harf='a';
        System.out.println(sayi5+harf);

        int sayi6='a';
        System.out.println(sayi6);
    }
}
