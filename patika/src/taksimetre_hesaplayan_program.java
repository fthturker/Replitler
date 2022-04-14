import java.util.Scanner;

public class taksimetre_hesaplayan_program {

    /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
    public static void main(String[] args) {

        double perKm = 2.20, total = 0, startPrice = 10;
        int km;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
         km  = scan.nextInt();

        total += (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);

    }// main sonu
}// class sonu
