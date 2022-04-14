package day11_stringManipulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str="Java Guzeldir";

        //Biz String method'larını arka arkaya kullanabiliriz
        //mesela ikiinci kelimenin ilk g harfini kucuk olarak yazdıralım

        //str.charAt(5); boyle yazdigimizde artık sonuc String degil char olacaktır
        //dolayısıyla String'de yapmak istedigimiz tum degisiklikleri
        //once yapıp sonra charAt() method'unu kullanmalıyız

        System.out.println(str.toLowerCase().charAt(5)); // g

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr"))); //JAVA GUZELDİR

    }
}
