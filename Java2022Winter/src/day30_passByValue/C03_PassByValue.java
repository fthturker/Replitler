package day30_passByValue;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java pass By Value bir programlama dilidir
        bir primitive variable ı argument olarak bir method a yollarsaniz
        java o variable'i degil, degerini (value) method'a aktarir (pass)
         */
        double etiketFiyati=100;
        yuzdeOnIndirimYap(etiketFiyati);
        yuzdeOnIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method da etiket fiyati : " +etiketFiyati);

    }

    public static void yuzdeOnIndirimYap(double etiketFiyati) {

        etiketFiyati=etiketFiyati*0.90;
        System.out.println("Sizin icin %10 indirimli fiyatiniz : " +etiketFiyati);
    }
}
/*
Sizin icin %10 indirimli fiyatiniz : 90.0
Sizin icin %10 indirimli fiyatiniz : 90.0
iki indirimden sonra main method da etiket fiyati : 100.0
 */