package day14_StringManipulation;

public class C05_SifreKontrol {
    public static void main(String[] args) {
        //Soru 6) Kullaniciden bir sifre girmesini isteyin
        //Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
        //sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
        // ilk harf buyuk harf olmali
        //son harf kucuk harf olmali
        //sifre bosluk icermemeli
        //sifre uzunlugu en az 8 karakter olmali

        String sifre="asdf12345";

        boolean ilkHarf= false;

        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;
        } else {
            System.out.println("Sifrenizin ilk harfi buyuk olmalı");
        }

        boolean sonHarf=false;

        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z' ){
            sonHarf=true;
        } else {
            System.out.println("sifrenizin son harfi kucuk harf olmalı");
        }

        boolean bosluk= false;





    }
}
