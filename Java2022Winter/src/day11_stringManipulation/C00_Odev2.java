package day11_stringManipulation;

import java.util.Scanner;

public class C00_Odev2 {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //-
        //Girilen kelime cumlede kullanilmamis.
        //-
        //Girilen kelime cumlede 1 kere kullanilmis.
        //-
        //Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlamli bir cumle yaziniz: ");
        String cumle = scan.nextLine();
        System.out.println("Lutfen cumleniz icin aklinizda canlanan kelime yaziniz: ");
        String kelime = scan.next();
        int ilkKelime = cumle.indexOf(kelime);
        int ikinciKelime = cumle.indexOf(kelime, ilkKelime + 1);


        if (cumle.indexOf(kelime) == -1) {
            System.out.println("Girilen kelime cumlede kullanilmamistir.");
        } else if (ikinciKelime > ilkKelime) {
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmistir.");
        } else {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmistir");
        }
    }
}