import java.util.Scanner;
public class Scanner_10 {
    /*
    Kullanıcıdan dakika girmesini isteyin,
    Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

        INPUT:
        Dakika sayısı: 3456789
        OUTPUT :
        3456789 dakika yaklaşık 6 yıl 210 gündür
     */
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Kaç dakika üzerinden işlem yapalım?");
        int dakika = girdi.nextInt();
       int toplamGun=0;
       int toplamYil=0;

        int gun=dakika/(24*60);
        toplamGun=gun;
        int yil=gun/365;
        toplamYil=yil;

        System.out.println(dakika +" dakika yaklasik "+toplamYil +" yıl "+toplamGun +" gundur");
    }
}
