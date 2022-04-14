package day11_stringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";
        //istersek char olarak bir harfin index'ini dondurur
        System.out.println(str1.indexOf('J')); //0

        //istersek bir harf ya da metin olarak verdigimiz String'in index'ini dondurur
        System.out.println(str1.indexOf("l")); //19
        System.out.println(str1.length()-1); //35
        System.out.println(str1.indexOf("aska")); //10

        //aynı harften birden fazla varsa ?
        System.out.println(str1.indexOf("b")); //5 buldugu ilk dogru esleşmeninin index'ini dondurur

        System.out.println( str1.indexOf('b', 5));
        //bu method'da java aramaya fromIndex olarak yazdıgımız index'den baslar
        //(inclusive)

        //verilen String'deki 2. a harfinin index'ini bulalım
        int ilkindex= str1.indexOf('a'); //1
        System.out.println(str1.indexOf('a',ilkindex+1)); //3

        //verilen String'deki 2. b harfinin index'ini bulalım
        int ilkbindex= str1.indexOf('b'); //5
        System.out.println(str1.indexOf('b',ilkbindex+1)); //9

        //20. index den sonra guzel aratalım
        System.out.println(str1.indexOf("guzel",20)); //31

        //String 'de olmayan bir harf aratsak
        System.out.println(str1.indexOf('y')); // y yok demesi lazım ama return type'i index
        //yok demenin sayısal karsılıgı olarak Java -1 dondurmeye tercih etmıstir

        //kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdırın
        //iceriyorsa mailiniz kabul edildi yazın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mailinizi yazin");
        String mail=scan.next();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gecersiz");
            System.out.println("Tekrar Deneyin");
        }else{
            System.out.println("mailiniz kabul edildi");
        }

        //OZET: indexOf metod'u icerisine yazılan String veya char'ın
        //metinde hangi index'de oldugu bize dondurur
        //eger aradıgımız metin veya char yoksa, olmadıgının delili
        //olarak bize -1 dondurur
    }
}
