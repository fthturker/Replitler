import java.util.Scanner;

public class kdv_Tutarı_Hesaplayan_Program {
    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp
     ekrana bastıran programı yazın.

    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;

    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise
     KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Ucret tutarinizi giriniz : ");
        double tutar, kdvOran=0.18;
        tutar= input.nextDouble();


        double kdvTutar=tutar*kdvOran;
        double kdvliTutar=tutar + kdvTutar;

        String yeni_Kdv = 1000>tutar && tutar>0 ? "0.18" : "0.08";
        System.out.println("Yeni KDV orani : " + yeni_Kdv);

        System.out.println("Kdv'siz Turar : " +tutar);
        System.out.println("Kdv oranimiz : " +kdvOran);
        System.out.println("Kdv tutar : " +kdvTutar);
        System.out.println("Kdv'li tutar : " +kdvliTutar);
    }
}
