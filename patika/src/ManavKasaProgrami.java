import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin
        kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL
                 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Almis oldugunuz urunlerin kilo olarak degerlerini yaziniz");

        System.out.print("armut:");
        double armut = scan.nextDouble();
        System.out.print("elma:");
        double elma = scan.nextDouble();
        System.out.print("domates:");
        double domates = scan.nextDouble();
        System.out.print("muz:");
        double muz = scan.nextDouble();
        System.out.print("patlican:");
        double patlican = scan.nextDouble();


        double toplamTutar;

        toplamTutar = ((armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5));

        System.out.println("Toplam Tutar : " + toplamTutar+" TL");
    }
}
