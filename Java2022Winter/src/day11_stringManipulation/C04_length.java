package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        //kullanıcıdan ismini alip bas harfini ve son harfini buyuk harflerle yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length()); //0

        String str2=null;
        System.out.println(str2);
        // System.out.println(str1.length()); //calıstırıldıgında hata verir

        String str3;
        // System.out.println(str3);
        //str3 ile str2'ye deger atanmamistir
        //str2 null pointer ile isaretlendiginden java durumun kontrol altında oldugu bilir
        //ve geriye kalan kodun calısmasına engel olmaz
        //ancak str3'e bir deger ataması olmayınca java altını kırmızı cizer
        //ve bu durum duzeltilinceye kadar kodun geriye kalanının calısmasına da ızın vermez
    }
}
