import java.util.Scanner;

public class Not_ortalaması {
    public static void main(String[] args) {
        /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin
        sınav puanlarını kullanıcıdan alan
        ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        küçük ise "Sınıfta Kaldı" yazsın.
         */
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        matematik = scan.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = scan.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = scan.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = scan.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = scan.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = scan.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = (toplam / 6.0);
        System.out.println("Ortalamaniz : " + sonuc);

        System.out.println("***DURUMUNUZ HESAPLANIYOR***");
        String ortalama = sonuc>= 60.0 ? "Gecti" : "Kaldi";
        System.out.println("sonuc : " + ortalama);
    }
}
