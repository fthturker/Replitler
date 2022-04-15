import java.util.Scanner;

public class Scanner_8 {
    /*
    Kullanıcıdan üç basamaklı bir sayı girmesini ve
    bu sayının basamaklarının toplamını bulmasını isteyin.

    Örnek Çıktı:

    Verilen tamsayının rakamları toplamı 10'dur.
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("uc basamakli bir sayi giriniz :");
    int sayi=scan.nextInt();

    int rakam=0;
    int rakamlarToplami=0;


        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami +=rakam;
        sayi/=10;

        System.out.print("girdiginiz sayinin rakamlar toplami : "+ rakamlarToplami);

    }
}
