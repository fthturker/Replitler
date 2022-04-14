package day11_stringManipulation;

public class C06_Soru2 {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin
        // cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="tyu";

        int ilkKullanım=cumle.indexOf(kelime); //-1 veya index
        int ikinciKullanım= cumle.indexOf(kelime, ilkKullanım+1);

        if (ilkKullanım==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ikinciKullanım==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }
    }
}
