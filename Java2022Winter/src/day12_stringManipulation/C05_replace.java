package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str="Bugun ne cok sey ogrendik";

        //bu cumledeki bosluk dısındaki karakter sayısını bulunuz
        System.out.println("space haric karakter sayisi : " + str.replace(" ", "").length()); //21

        //atama yapılmadıgı surece orjınal string kalıcı olarak degismez
        //sadece o satır ıcın degisiklik yapılıp sonuc yazdırılmıs olur
        System.out.println("orjinal str karakter sayisi : " + str.length());


        //str da kalıcı degisiklik yapalım
        //bugun yerine yarin
        //ogrendik yerine ogrenecegiz

        str=str.replace("Bugun", "Yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println("kalici degisiklikten sonra : " + str);

        str=str.replace("cok", "az");

        System.out.println(str);
    }
}
