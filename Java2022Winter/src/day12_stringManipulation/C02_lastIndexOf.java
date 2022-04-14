package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin
        // cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle= "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanım=cumle.indexOf(kelime); //-1 veya index
        int sonKullanım=cumle.lastIndexOf(kelime);

        if (ilkKullanım==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (ilkKullanım==sonKullanım){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis");
        }
        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4)); //4 (4 dahil)

    }
}
