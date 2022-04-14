package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler= new ArrayList<>();
        isimler.add("Fatih");
        isimler.add("Yavuz");
        isimler.add("Zeynep");
        isimler.add("Ayse");
        System.out.println(isimler); // [Fatih, Yavuz, Zeynep, Ayse]

        // remove (istenenObject) method'u istenen elementi kaldırıp bize true yada false doner
        // eger remove isleminin yapıldıgını kontrol etmek istiyorsanız
        // method'u boolean bir variable'a atayabilirsiniz

        boolean sonuc= isimler.remove("Fatih"); // true

        // sonucu kullanıcya yazdırmak isterseniz
        // if/else ile istediginiz degerlendirmeyi yazabilirsiniz
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else {
            System.out.println("istediginiz isim listede olmadıgından silinemedi");
        }
        System.out.println(isimler); // [Yavuz, Zeynep, Ayse]

        sonuc= isimler.remove("Ali");
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else {
            System.out.println("istediginiz isim listede olmadıgından silinemedi");
        }

        // remove (index) yazdigimizde sildim/silmedim ihtimali kalmaz
        //bize remove edilen elementi doner

        //System.out.println(isimler.remove(1)); // Zeynep i siler ve delil olarak Zeynep ismini bize dondurur
        isimler.remove(1);

        // yazdirsak da yazdırmasak da liste degisti ve 1. index'deki element silindi

        System.out.println(isimler); // [Yavuz, Ayse]

    }
}
