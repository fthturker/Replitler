import java.util.Scanner;

public class Scanner_9 {
    /*
    Girilen zamanı saniyeye çeviren bir program yazınız.

    Örnek Çıktı:

    1 saat 10 dakika 50 saniye ==>

    4250 saniye
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("zamani giriniz :");
        System.out.println("saat:");
        int saat=scan.nextInt();
        System.out.println("dakika:");
        int dakika=scan.nextInt();
        System.out.println("saniye:");
        int saniye=scan.nextInt();

        int toplamZaman=0;

        toplamZaman=((saat*60*60)+(dakika*60)+saniye);
        System.out.println("hesaplanan zaman : " +toplamZaman +" saniyedir");

    }
}
